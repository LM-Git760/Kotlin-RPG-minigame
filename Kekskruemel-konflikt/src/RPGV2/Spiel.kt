package RPGV2

/*
class Spiel(var helden: MutableList<Held>, var gegner: MutableList<Gegner>) {
    fun start() {
        helden.forEach { held -> println("${held.name} (${held.hp} HP) tritt auf das Spielfeld!") }
        Thread.sleep(1000)
        gegner.forEach { gegner -> println("${gegner.name} (${gegner.hp} HP) wurde auf dem Spielfeld gespawnt!") }
        Thread.sleep(1000)
        while (helden.any { it.hp > 0 } && gegner.any { it.hp > 0 }) {
            for (held in helden) {
                println("${held.name}(${held.hp}HP) ist am Zug")
                if (held.hp > 0) {
                    if (held.verflucht){
                        held.hp -= held.hp / 10
                        println("Der ${held.name} ist verflucht: ${held.hp}HP wird abgezogen ${held.hp / 10} HP")

                    }
                    val aktion = held.waehleAktion()
                    val ziel = held.waehleZiel(gegner.filter { it.hp > 0 })
                    Thread.sleep(2000)
                    aktion.ausfuehren(held, ziel)
                    }
                }
            }
            for (gegner in gegner) {
                println("${gegner.name}(${gegner.hp}HP) ist an der Reihe.")
                if (gegner.hp > 0) {
                    if (gegner.verflucht){
                        gegner.hp -= gegner.hp / 10
                    }
                    val aktion = gegner.waehleAktion()
                    val ziel = gegner.waehleZiel(helden.filter { it.hp > 0 })
                    aktion.ausfuehren(gegner, ziel)
                    if (ziel.geschuetzt){
                        ziel.geschuetzt = false
                    }
                }
            }
        }
        // Spielende hier...
    }
*/


class Spiel(var helden: MutableList<Held>, var gegner: MutableList<Gegner>) {
    fun start() {
        // Ausgabe der Helden und Gegner zu Beginn des Spiels
        helden.forEach { held -> println("${held.name} (${held.hp} HP) tritt auf das Spielfeld!") }
        Thread.sleep(1000)
        gegner.forEach { gegner -> println("${gegner.name} (${gegner.hp} HP) wurde auf dem Spielfeld gespawnt!") }
        Thread.sleep(1000)

        while (helden.isNotEmpty() && gegner.isNotEmpty()) {
            // Helden sind am Zug
            for (held in helden) {
                if (held.hp > 0) {
                    println("${held.name}(${held.hp}HP) ist am Zug")
                    val aktion = held.waehleAktion()
                    val ziel = held.waehleZiel(gegner.filter { it.hp > 0 })
                    Thread.sleep(2000)
                    aktion.ausfuehren(held, ziel)
                    when {
                        ziel.hp <= 0 -> {
                            println("${ziel.name} ist tot.")
                            gegner.remove(ziel)
                        }
                    }
                }
            }
            // Gegner sind am Zug
            for (gegner in gegner) {
                if (gegner.hp > 0) {
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
        if (helden.isEmpty()){
            println("Gegner Hat gewonnen! Deine Helden sind Tot!")
        }else if (gegner.isEmpty()){
            print("Glückwunsch du hast Gewonnen!")
        }
        }
    }


