package August_2.functions
fun player(name:String = "unKnown",position:String="unKnown",rating:Int=0):Unit{
    println("player name is $name \n" +
            "position: $position \n" +
            "Rating :$rating\n")
}
fun main() {
    //we can specify the number of paramaters in the function and their types
    //and can also provide some values coz in case if the call statement aint providing values then these default values will be used
    println("Premiere league player details")
    player()
    player("Trent-Alexander-Arnold","Right back (Rb)",5)
    player("salah")
    player("virgil vandijk","center back(cb)")


}