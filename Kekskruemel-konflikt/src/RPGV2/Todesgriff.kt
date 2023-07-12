package RPGV2

class Todesgriff(val schaden: Int = 45) : Aktion("Todesgriff") {
    override fun ausfuehren(ausfuehrer: Charakter, ziel: Charakter) {
        ziel.hp -= schaden
    }
}