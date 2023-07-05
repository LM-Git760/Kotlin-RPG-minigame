class Zauberbaecker(var name: String):Held() {
    init {

        this.backkunst +=8
        this.kraft += this.backkunst



    }

    fun kuchenBombardement(gegner: Gegner){
        gegner.gesundheit -= this.kraft
        println("        ,--.!,\n" +
                "     __/   -*-\n" +
                "   ,d08b.  '|`\n" +
                "   0088MM     \n" +
                "   `9MMP'     \n")
                println("KUCHENBOMBARDEMENT ${gegner.name} \u001B[32m\u001B[1m${gegner.gesundheit} LP\u001B[0m verbleibend")
    }

    fun zuckergussSchutzschicht(charakter: Charakter){
        charakter.gesundheit += charakter.heilung
        println("\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\n")
        println("$name wurde mit Zuckerguss überzogen, Neue Gesundheit: \u001B[32m\u001B[1m${charakter.gesundheit} LP\u001B[0m")
    }
}

