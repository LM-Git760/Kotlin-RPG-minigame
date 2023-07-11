abstract class Charakter(val name: String, var hp: Int) {
    abstract fun waehleAktion() : Aktion
    abstract fun waehleZiel(gegner:List<Charakter>) : Charakter
}