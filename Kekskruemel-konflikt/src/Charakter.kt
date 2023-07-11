abstract class Charakter(val name: String, var hp: Int, var schaden: Double) {
    abstract fun aktion(): Aktion
}