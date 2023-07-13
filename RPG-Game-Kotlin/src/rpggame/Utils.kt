package rpggame

class AdminHammer() : Aktion("ADMINHAMMER") {
    override fun ausfuehren(ausfuehrer: Charakter, ziel: Charakter) {
        ziel.hp -= 99999
    }
}