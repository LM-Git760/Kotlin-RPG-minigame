package RPGV2

class Vitamine : Gegenstand("Vitamine") {
    override fun benutzen(held: Held) {
        held.aktionen.forEach{
            if (it is NormalerAngriff){
                it.schaden = (it.schaden*1.1).toInt()
            }
        }
    }
}