import kotlin.random.Random

class Angriff(val schaden:Int = Random.nextInt(12, 71)) : Aktion("Angriff"){
    override fun ausfuehren(ausfuehrer: Charakter, ziel: Charakter) {
        ziel.hp -= schaden
    }
}
