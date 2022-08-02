fun main(args:Array<String>) {
    val numberImplicit = 2343
    println(numberImplicit::class.java)
    val numberexplicit:Long = 2343
    println(numberexplicit::class.java)
//    for float and double we can specify "L" or "F in the end to specify them as long  or float"

}