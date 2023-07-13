package rpggame

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction

abstract class Held(name: String, hp: Int, val aktionen: List<Aktion>,val beutel: Beutel): Charakter(name,hp, hp){

    override fun waehleAktion(): Aktion {
        //Zeige alle verfügbaren Aktionen für den Helden an
        println("Bitte wählen sie eine der Folgenden Möglichkeiten:")
        aktionen.forEachIndexed { index, aktion -> println("${index + 1}: ${aktion.name}") }

        //Zeige Option für Beutel an, wenn dieser nicht leer ist.
        if (beutel.gegenstaende.isNotEmpty()){
            println("${aktionen.size + 1}: Gegenstand aus dem Beutel benutzen (${beutel.gegenstaende.size})")
        }

        // Benutzer Auswahl einlesen
        val eingabe:Int? = readln()?.toIntOrNull()?.minus(1)


        //Überprüfung ob eingabe für Aktion gültig oder Gegenstand benutzen gewählt wurde
        return if (eingabe != null && eingabe < aktionen.size) {
            aktionen[eingabe]
        } else if (eingabe == aktionen.size && beutel.gegenstaende.isNotEmpty()) {
            waehleUndBenutzeGegenstand()
            waehleAktion()
        } else {
            println("Ungültige Eingabe.")
            waehleAktion()
        }
        }



    override fun waehleZiel(gegner: List<Charakter>): Charakter {
        val index = zeigeZiele(gegner)
        return gegner[index]
    }









    private fun waehleUndBenutzeGegenstand() {
        //Alle Gegenstände im Beutel anzeigen
        println("Wählen sie einen der folgenden Gegenstände:")
        beutel.gegenstaende.forEachIndexed { index, aktion -> println("${index + 1}: ${aktion.name}") }

        val auswahl = readln()?.toIntOrNull()?.minus(1)
        //Eingabe aus Beutel benutzen
        if (auswahl != null && auswahl < beutel.gegenstaende.size){
            val gegenstand = beutel.gegenstaende[auswahl]
            gegenstand.benutzen(this)
            //Nach Verwendung Gegenstand aus Beutel entfernen
            beutel.gegenstaende.removeAt(auswahl)
        } else {
            println("Ungültige eingabe")
            waehleUndBenutzeGegenstand()
        }
    }






}


