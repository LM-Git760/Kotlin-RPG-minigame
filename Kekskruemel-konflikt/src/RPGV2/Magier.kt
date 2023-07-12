package RPGV2

class Magier(name: String, hp: Int, beutel: Beutel)
    :Held(name, hp, listOf(
    Feuerball(),
    Energieentzug(),
    Fluch(),
),beutel)

