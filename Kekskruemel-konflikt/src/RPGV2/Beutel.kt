package RPGV2

class Beutel(var gegenstaende: MutableList<Gegenstand> = mutableListOf()) {
    fun benutze(int: Int, held: Held){
        val gegenstand = gegenstaende[int]
        gegenstand.benutzen(held)
        gegenstaende.removeAt(int)
    }
}