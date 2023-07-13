package rpggame

class Drache : Gegner("Drache der Verdammniss", 300, listOf(
    NormalerAngriff(),
    Todesgriff(),
    AdminHammer(),
    Energieentzug(),))