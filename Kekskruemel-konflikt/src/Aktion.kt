abstract class Aktion(val name:String){
    abstract fun ausfuehren(ausfuehrer: Charakter, ziel: Charakter)
}