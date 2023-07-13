package rpggame

import kotlin.random.Random

abstract class Gegner(name: String, hp: Int,val aktionen: List<Aktion>) : Charakter(name, hp, hp) {

    override fun waehleAktion(): Aktion {
        return aktionen[Random.nextInt(aktionen.size)]
    }

    override fun waehleZiel(gegner: List<Charakter>): Charakter {
            return gegner[Random.nextInt(gegner.size)]
        }
    }
