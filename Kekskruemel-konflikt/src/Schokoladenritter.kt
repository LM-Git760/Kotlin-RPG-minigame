class Schokoladenritter(name: String):Held() {
    init {
        println("\u001B[33m+---------------------------------------+")
        println("|Name| Gesundheit | Kraft | Verteidigung|")
        println("+---------------------------------------+")
        println("| \u001B[0m$name\u001B[33m  |\t")
        println("| \u001B[32m\u001B[1m$gesundheit LP   \u001B[0m\u001B[33m|\t")
        println("| \u001B[31m\u001B[1m$kraft TP    \u001B[0m\u001B[33m|\t")
        println("| \u001B[32m\u001B[1m$heilung LP    \u001B[0m\u001B[33m|\t")
        println("+----------+")


        val ritter = listOf(
            "  / \\, | ,        .--.",
            "  |   =|= >      |.--.|",
            "  \\ /` | `       |====|",
            "  `    |         |`::`|",
            "       |     .-;`\\..../`;-.",
            "      /\\/\\  /  |...::...|  `\\",
            "      |:'\\  |  /'''::'''\\   |",
            "       \\ /\\;-,/\\   ::   /\\--;",
            "       |\\ \\  /  >._::_.<,<__>",
            "       | `\"\"`  /   ^^   \\|  |",
            "       |       |        |\\::/",
            "       |       |        |/|||",
            "       |       |___/\\___| ''''",
            "       |        \\_ || _/",
            "       |        <_ >< _>",
            "       |        |  ||  |",
            "       |        |  ||  |",
            "       |       _\\.:||:./_",
            "       |      /____/\\____\\"
        )
        for (line in ritter) {
            println(line)
        }
        println("+----------+")
        println("\u001B[0m$name hat das Spielfeld betreten!!")
    }


}