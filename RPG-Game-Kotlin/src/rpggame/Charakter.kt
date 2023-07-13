package rpggame

abstract class Charakter(
    val name: String,
    var hp: Int,
    val maxHp: Int = 200,
    var verflucht:Boolean = false,
    var geschuetzt:Boolean = false)
{
    abstract fun waehleAktion() : Aktion
    abstract fun waehleZiel(gegner:List<Charakter>) : Charakter
}