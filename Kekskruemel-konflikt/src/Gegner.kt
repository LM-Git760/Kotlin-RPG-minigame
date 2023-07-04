class Gegner(name: String):Charakter(name,) {

    init {
        var gesundheit = 100
        var kraft = 30
        var heilung = 45
        println("\u001B[33m+---------------------------------------+")
        println("|Name| Gesundheit | Kraft | Verteidigung|")
        println("+---------------------------------------+")
        println("| \u001B[0m$name\u001B[33m  |\t")
        println("| \u001B[32m\u001B[1m$gesundheit LP   \u001B[0m\u001B[33m|\t")
        println("| \u001B[31m\u001B[1m$kraft TP    \u001B[0m\u001B[33m|\t")
        println("| \u001B[32m\u001B[1m$heilung LP    \u001B[0m\u001B[33m|\t")
        println("+---------------------------------------+")
        println("\u001B[0m$name hat das Spielfeld betreten!!")
    }



}