package RPGV2

abstract class Gegenstand(val name:String) {
    abstract fun benutzen(held: Held)
}