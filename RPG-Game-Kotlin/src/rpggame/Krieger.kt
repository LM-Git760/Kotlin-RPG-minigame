package rpggame

class Krieger(name: String, hp:Int, beutel: Beutel) : Held(name, hp, listOf(
        NormalerAngriff(),
        SchwertSchwinger()), beutel
)