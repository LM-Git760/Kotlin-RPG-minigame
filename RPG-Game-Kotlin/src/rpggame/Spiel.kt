package rpggame

class Spiel(var helden: MutableList<Held>, var gegner: MutableList<Gegner>) {
    fun start() {
        println("---------- SPIEL BEGINNT ----------\n")

        // Ausgabe der Helden und Gegner zu Beginn des Spiels
        helden.forEach { held -> println("${held.name} (${held.hp} HP) tritt auf das Spielfeld!") }
        Thread.sleep(1500)
        gegner.forEach { gegner -> println("${gegner.name} (${gegner.hp} HP) wurde auf dem Spielfeld gespawnt!") }
        Thread.sleep(1500)

        while (helden.any { it.hp > 0 } && gegner.any { it.hp > 0 }) {
            // Helden sind am Zug
            for (held in helden) {
                if (held.hp > 0 && gegner.any {it.hp > 0}) {
                    println("${held.name}(${held.hp}HP) ist am Zug\n")
                    val aktion = held.waehleAktion()
                    val ziel = held.waehleZiel(gegner.filter { it.hp > 0 })
                    Thread.sleep(2000)
                    aktion.ausfuehren(held, ziel)
                    if (ziel.hp <= 0) {
                        println("${ziel.name} ist tot.")
                        gegner.remove(ziel)
                    }
                }
            }
            // Gegner sind am Zug
            println("---------- GEGNER SIND AM ZUG ----------\n")
            for (gegner in gegner) {
                if (gegner.hp > 0 && helden.any {it.hp > 0}) {
                    println("${gegner.name}(${gegner.hp}HP) ist an der Reihe.")
                    val aktion = gegner.waehleAktion()
                    val ziel = gegner.waehleZiel(helden.filter { it.hp > 0 })
                    aktion.ausfuehren(gegner, ziel)
                    println("${gegner.name} (${gegner.hp}HP) hat ${ziel.name} (${ziel.hp}HP) mit ${aktion.name} angegriffen! \n")
                    if (ziel.hp <= 0) {
                        println("${ziel.name} ist tot.")
                        helden.remove(ziel)
                    }
                    println("---------------------------------")
                    Thread.sleep(850)
                }
            }
        }
        // Spielende
        println("---------- SPIEL ENDE ----------\n")
        if (helden.any { it.hp > 0 }) {
            println("Glückwunsch! Du hast alle Gegner besiegt.")
        } else {
            println("GAME OVER. Alle Helden sind tot.")
        }
    }
}