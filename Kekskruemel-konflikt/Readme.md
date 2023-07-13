# RPG Spiel

Ein einfaches, textbasiertes Rollenspiel (RPG), das in Kotlin geschrieben wurde.

## Inhaltsverzeichnis

1. [Einleitung](#einleitung)
2. [Funktionalitäten](#funktionalitäten)
3. [Installation](#installation)
4. [Verwendung](#verwendung)

## Einleitung

In diesem Spiel kannst du verschiedene Charaktere mit einzigartigen Fähigkeiten gegen eine Vielzahl von Gegnern kämpfen.
Dein Held hat auch einen Beutel, um verschiedene Gegenstände wie Heiltränke und Vitamine zu verwenden.

## Funktionalitäten

- Erstelle ein Team mit Helden die ihre eigenen Fähigkeiten besitzen.
- Bekämpfe ein Team von Gegner mit deinem Team von Helden
- Verwende verschiedene Gegenstände aus deinem Beutel.

## Installation

Stellen Sie sicher, dass Sie Kotlin und JDK auf Ihrem Computer installiert haben.

Klonen Sie dieses Repository und importieren Sie es in Ihre bevorzugte IDE.

## Verwendung

Hier ist ein einfaches Beispiel, wie man das Spiel startet:

```kotlin
fun main() {
    //Helden Team erstellen
    val helden: MutableList<Held> = mutableListOf(Magier("Hokimoki", 100, Beutel(mutableListOf(Heiltrank(), Vitamine()))),
        Krieger("MrSteel", 100, Beutel(mutableListOf(Vitamine(), Heiltrank()))))
    //Gegnerische Team erstellen
    val gegner: MutableList<Gegner> = mutableListOf(DunklerMagier(), Drache())
    //Spielfeld anlegen
    val spielfeld: Spiel = Spiel(helden, gegner)
    //Spiel starten
    spielfeld.start()
}
