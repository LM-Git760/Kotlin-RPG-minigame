package rpggame

class SchwertSchwinger : Aktion("Schwert Schwinger") {
    override fun ausfuehren(ausfuehrer: Charakter, ziel: Charakter) {
        val schaden = listOf<Int>(80,56,64,87,77,99,86,64,97,120,135,212).random()
        ziel.hp -= schaden
        println("${ziel.name}(${ziel.hp}HP) wurden $schaden Schaden hinzugefügt")
    }
}