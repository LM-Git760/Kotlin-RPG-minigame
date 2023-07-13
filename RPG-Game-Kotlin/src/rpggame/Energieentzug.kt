package rpggame

class Energieentzug : Aktion("Energieentzug") {
    override fun ausfuehren(ausfuehrer: Charakter, ziel: Charakter) {
        val energie: Int = (2..46).random()
        ausfuehrer.hp += energie
        ziel.hp -= energie
        println("${ausfuehrer.name}(${ausfuehrer.hp}HP) hat Energieentzug auf ${ziel.name}(${ziel.hp}HP) eingesetzt")
        Thread.sleep(1000)

    }
}