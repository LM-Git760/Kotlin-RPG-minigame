package rpggame

abstract class Gegenstand(val name:String) {
    abstract fun benutzen(held: Held)
}