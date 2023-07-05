fun main() {
    var held = Zauberbaecker("hansi")
    val gegner = Gegner("Jürgen")
    heilung(held)
    println(held.gesundheit)
    println(gegner.gesundheit)
    held.zuckergussSchutzschicht(gegner)

    held.kuchenBombardement(gegner)

}
