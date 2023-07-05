open class Held(
    var backkunst:Int = 0,
    var schokoladenstaerke:Int = 0) :Charakter() {


}



fun aktionAusfuehren(charakter: Charakter, gegner: Gegner) {
    angreifen(gegner,charakter)
}
fun gegenstandBenutzen(gegenstand: Gegenstand){
    gegenstandBenutzen(gegenstand)
}

