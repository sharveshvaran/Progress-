package August_2.functions

fun player1(name:String = "unKnown",position:String="unKnown",rating:Int=0):Unit{
    println("player name is $name \n" +
            "position: $position \n" +
            "Rating :$rating\n")
}
fun main() {
    //we can specify the number of paramaters in the function and their types
    //and can also provide some values coz in case if the call statement aint providing values then these default values will be used
    println("Premiere league player details")
    player1()
    player1("Trent-Alexander-Arnold","Right back (Rb)",5)
    player1("salah")
    player1("virgil vandijk","center back(cb)")
    //if we want to pass only certain arguments but the order bothers you then we can specify the name while calling the functon
    //thus known as named arguments
    player1(name = "bobby firmino", rating = 5)//named arguments


}