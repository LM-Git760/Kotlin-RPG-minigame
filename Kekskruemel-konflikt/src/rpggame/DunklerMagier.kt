package rpggame

class DunklerMagier: Gegner("Dunkler Magier", 200, listOf(
    NormalerAngriff(),
    Todesgriff(),
    Energieentzug()
))