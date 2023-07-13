package rpggame

fun main(){
    val heldenTeam = mutableListOf<Held>(Magier(
        name = "Mirakulis",
        hp = 100,
        beutel = Beutel(mutableListOf(Heiltrank(),Vitamine()))
    ),Krieger(
        name = "Sir Haudrauf",
        hp = 100,
        beutel = Beutel(mutableListOf(Heiltrank(),Vitamine()))
    ))

    val gegnerTeam : MutableList<Gegner> = mutableListOf(DunklerMagier(),Unterboss(),Drache())

    val spielfeld: Spiel = Spiel(heldenTeam,gegnerTeam)
    spielfeld.start()
}

