package RPGV2

import kotlin.random.Random

class Feuerball(var schaden:Int = Random.nextInt(20,55)) : Aktion("Feuerball"){
    override fun ausfuehren(ausfuehrer: Charakter, ziel: Charakter) {
        if (ziel.geschuetzt){
            println("Feuerball wurde abgewehrt. ${ziel.name}(${ziel.hp}HP) ist von einem Zauber geschützt.")
        }else ziel.hp -= schaden
        println("${ziel.name}(${ziel.hp}HP) wurde getroffen -$schaden Leben")
    }
}