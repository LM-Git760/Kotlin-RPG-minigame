package rpggame
fun main() {
    val heros:MutableList<Held> = mutableListOf(Magier(
        "Hokimoki",
        100,
        Beutel()),
        Krieger(
            "MrSteel",
            100,
            Beutel(mutableListOf(Vitamine(),Heiltrank()))
        ),Krieger(
            "MrsGold",
            100,
            Beutel(mutableListOf(Vitamine(),Heiltrank()))
        ))
    val darkboys:MutableList<Gegner> = mutableListOf(DunklerMagier(),Drache())
    var spielfeld:Spiel = Spiel(heros,darkboys)
    spielfeld.start()
}