package rpggame

class Unterboss: Gegner("Unterboss", 100, listOf(
    NormalerAngriff(),
    Todesgriff(),
    Fluch(),
))