fun main(args:Array<String>){
    //if we do arithemtic operations in two datatypes we get the result type of the larger type
//    if we multiply int and double we will get double
//    if we multiply int and short we get int
//            if we multiply int and byte then we get int
    val a =10L
    val b = 10F
    val result = b/a
    println(result::class.java)
}
//Byte<Short<INt<Long<Float<Double