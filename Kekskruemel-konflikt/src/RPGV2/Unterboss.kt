package RPGV2

class Unterboss: Gegner("Unterboss", 100, listOf(
    NormalerAngriff(),
    Todesgriff(),
    Fluch(),
))