package RPGV2

class Drache : Gegner("Drache der Verdammniss", 300, listOf(
    NormalerAngriff(),
    Todesgriff(),
    AdminHammer(),
    Energieentzug(),
    Fluch(),
))