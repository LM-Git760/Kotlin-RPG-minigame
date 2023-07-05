open class Charakter(
    var gesundheit: Int = 100,

    var kraft: Int = 35,
    var heilung: Int = 40
){



}


     fun angreifen(gegner: Gegner, charakter: Charakter){
        gegner.gesundheit -= charakter.kraft
    }
    fun heilung(charakter: Charakter){
        charakter.gesundheit += charakter.heilung
        println(" Neue Gesundheit: \u001B[32m\u001B[1m${charakter.gesundheit} LP\u001B[0m")
    }

