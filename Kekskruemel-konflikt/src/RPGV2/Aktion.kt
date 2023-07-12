package RPGV2

import kotlin.random.Random

abstract class Aktion(val name: String) {
    abstract fun ausfuehren(ausfuehrer: Charakter, ziel: Charakter)
}

class Fluch : Aktion("Fluch"){
    override fun ausfuehren(ausfuehrer: Charakter, ziel: Charakter) {
        val schaden = ziel.hp * 0.1

        ziel.verflucht = true
        ziel.hp -= schaden.toInt()
        println("${ziel.name}(${ziel.hp}HP) wurde verflucht!")
    }
}

//class Schutzzauber : Aktion("Schutzzauber"){
//    override fun ausfuehren(ausfuehrer: Charakter, ziel: Charakter) {
//        ziel.geschuetzt = true
//    }
//}

//class Beschwoeren(var spiel: Spiel) : Aktion("Beschwören"){
//    override fun ausfuehren(ausfuehrer: Charakter, ziel: Charakter) {
//        spiel.gegner.plusElement(Unterboss())
//    }
//}
