package rpggame

class Spiel(var helden: MutableList<Held>, var gegner: MutableList<Gegner>) {
    fun start() {
        // Ausgabe der Helden und Gegner zu Beginn des Spiels
        helden.forEach { held -> println("${held.name} (${held.hp} HP) tritt auf das Spielfeld!") }
        Thread.sleep(800)
        gegner.forEach { gegner -> println("${gegner.name} (${gegner.hp} HP) wurde auf dem Spielfeld gespawnt!") }
        Thread.sleep(800)

        while (helden.any { it.hp > 0 } && gegner.any { it.hp > 0 }) {
            // Helden sind am Zug
            for (held in helden) {
                if (held.hp > 0 && gegner.any {it.hp > 0}) {
                    println("${held.name}(${held.hp}HP) ist am Zug")
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
            for (gegner in gegner) {
                if (gegner.hp > 0 && helden.any {it.hp > 0}) {
                    println("${gegner.name}(${gegner.hp}HP) ist an der Reihe.")
                    val aktion = gegner.waehleAktion()
                    val ziel = gegner.waehleZiel(helden.filter { it.hp > 0 })
                    aktion.ausfuehren(gegner, ziel)
                    println("${gegner.name} (${gegner.hp}HP) hat ${ziel.name} (${ziel.hp}HP) mit ${aktion.name} angegriffen!")
                    if (ziel.hp <= 0) {
                        println("${ziel.name} ist tot.")
                        helden.remove(ziel)
                    }
                    Thread.sleep(850)
                }
            }
        }
        // Spielende hier...
        if (helden.any { it.hp > 0 }) {
            println("Glückwunsch! Du hast alle Gegner besiegt.")
        } else {
            println("GAME OVER. Alle Helden sind tot.")
        }
    }
}

//class Spiel(var helden: MutableList<Held>, var gegner: MutableList<Gegner>) {
//    fun start() {
//        // Ausgabe der Helden und Gegner zu Beginn des Spiels
//        helden.forEach { held -> println("${held.name} (${held.hp} HP) tritt auf das Spielfeld!") }
//        Thread.sleep(800)
//        gegner.forEach { gegner -> println("${gegner.name} (${gegner.hp} HP) wurde auf dem Spielfeld gespawnt!") }
//        Thread.sleep(800)
//
//        while ((helden.isNotEmpty() && helden.any { it.hp > 0 }) && (gegner.isNotEmpty() && gegner.any { it.hp > 0 })) {
//            // Helden sind am Zug
//            for (held in helden) {
//                if (gegner.none { it.hp > 0 }) {
//                    println("Glückwunsch! Du hast alle gegner besiegt.")
//                    return
//                }
//                if (held.hp > 0) {
//                    println("${held.name}(${held.hp}HP) ist am Zug")
//                    val aktion = held.waehleAktion()
//                    val ziel = held.waehleZiel(gegner.filter { it.hp > 0 })
//                    Thread.sleep(2000)
//                    aktion.ausfuehren(held, ziel)
//                    when {
//                        ziel.hp <= 0 -> {
//                            println("${ziel.name} ist tot.")
//                            gegner.remove(ziel)
//                        }
//                    }
//                }
//            }
//            // Gegner sind am Zug
//            for (gegner in gegner) {
//                if (helden.none { it.hp > 0 }) {
//                    println("GAME OVER deine Helden sind Tot.")
//                    return
//                }
//                if (gegner.hp > 0) {
//                    println("${gegner.name}(${gegner.hp}HP) ist an der Reihe.")
//                    val aktion = gegner.waehleAktion()
//                    val ziel = gegner.waehleZiel(helden.filter { it.hp > 0 })
//                    aktion.ausfuehren(gegner, ziel)
//                    println("${gegner.name} (${gegner.hp}HP) hat ${ziel.name} (${ziel.hp}HP) mit ${aktion.name} angegriffen!")
//                    if (ziel.hp <= 0) {
//                        println("${ziel.name} ist tot.")
//                        helden.remove(ziel)
//                    }
//                    Thread.sleep(850)
//                }
//            }
//        }
//        }
//    }
//
//
