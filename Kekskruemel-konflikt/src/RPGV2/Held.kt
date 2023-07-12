package RPGV2

abstract class Held(name: String, hp: Int, val aktionen: List<Aktion>,beutel: Beutel): Charakter(name,hp, hp){

    override fun waehleAktion(): Aktion {
        val index = zeigeAktionen(aktionen)
        return aktionen.get(index)
    }

    override fun waehleZiel(gegner: List<Charakter>): Charakter {
        val index = zeigeZiele(gegner)
        return gegner[index]
    }



}


