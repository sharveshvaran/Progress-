fun main(args:Array<String>) {
    var name:String? = "sharvesh"
    name = null
    println(name)
//    we can have a variable with null value by using a question mark at the end of the variable type
//    ? - nullable type'
    var myName:String? = "sharvesh"
//    myName = null
    println(myName?.length)
//    since using a nullable operator for an variable we cant use the length property coz it may be null thus we use question mark
println (myName?.substring(3,7))
    var typeDouble:Double? = 13.94
    println(typeDouble?.times(6)?.toFloat())
    var numConsole = readLine()
    println(numConsole?.toDouble()?.times(7).toString().length)
}