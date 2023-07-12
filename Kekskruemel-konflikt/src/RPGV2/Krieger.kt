package RPGV2

class Krieger(name: String, hp:Int, beutel: Beutel) : Held(name, 100, listOf(
        NormalerAngriff(),
        AdminHammer(),
    ), beutel
)