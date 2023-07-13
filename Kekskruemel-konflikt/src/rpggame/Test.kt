package rpggame
fun main() {
    val heros:MutableList<Held> = mutableListOf(Magier(
        "Hokimoki",
        hp = 1,
        Beutel()),
        Krieger(
            "MrSteel", hp = 10,
            Beutel(mutableListOf(Vitamine(),Heiltrank()))
        ),Krieger(
            "MrsGold",
            hp = 10,
            Beutel(mutableListOf(Vitamine(),Heiltrank()))
        ))
    val darkboys:MutableList<Gegner> = mutableListOf(DunklerMagier(),Drache(),Unterboss())
    var spielfeld:Spiel = Spiel(heros,darkboys)
    spielfeld.start()
}