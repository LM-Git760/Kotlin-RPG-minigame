package rpggame

class Vitamine : Gegenstand("Vitamine") {
    override fun benutzen(held: Held) {
        held.hp += 50
        if (held.verflucht){
            held.verflucht = false
            println("${held.name} wurde von seinem Fluch befreit und um 50 HP geheilt")
        }else println("${held.name} ist nicht verflucht, Gesundheit wurde uum 50 HP erhöht.")
    }
}