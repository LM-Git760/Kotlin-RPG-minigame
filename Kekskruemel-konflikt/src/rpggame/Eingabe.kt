package rpggame

fun zeigeAktionen(aktionen: List<Aktion>): Int {
    println("Wähle eine Aktion aus:")
    for ((index, aktion) in aktionen.withIndex()) {
        println("${index + 1}: ${aktion.name}")
    }
    return readln().toInt() - 1
}

fun zeigeZiele(gegner: List<Charakter>): Int {
    println("Wähle ein Ziel aus:")
    for ((index, gegner) in gegner.withIndex()) {
        println("${index + 1}: ${gegner.name} (${gegner.hp} HP)")
    }
    return readln().toInt() - 1
}
