package rpggame

open class Fluch : Aktion("Fluch"){
    override fun ausfuehren(ausfuehrer: Charakter, ziel: Charakter) {
        val schaden = ziel.hp / 1.25
        ziel.verflucht = true
        ziel.hp -= schaden.toInt()
        println("${ziel.name}(${ziel.hp}HP) wurde verflucht! ${ziel.hp}HP übrig.")
    }
}
