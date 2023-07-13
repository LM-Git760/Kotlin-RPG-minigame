package rpggame

fun zeigeZiele(gegner: List<Charakter>): Int {
    println("Wähle ein Ziel aus:")
    for ((index, gegner) in gegner.withIndex()) {
        println("${index + 1}: ${gegner.name} (${gegner.hp} HP)")
    }
    return readln().toInt() - 1
}
