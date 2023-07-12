package RPGV2

import kotlin.random.Random

 abstract class Heilung(val heilung: Int = Random.nextInt(20, 86)): Aktion("Heilung"){
    fun heilen(ausfuehrer: Charakter, ziel: Charakter) {
        ausfuehrer.hp += heilung
    }
}