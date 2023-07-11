import kotlin.random.Random

class Heilung(val heilung: Int = Random.nextInt(20, 86)):Aktion("Heilung"){
    override fun ausfuehren(ausfuehrer: Charakter, ziel: Charakter) {
        ziel.hp += heilung
    }
}