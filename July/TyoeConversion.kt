fun main(args:Array<String>) {
//    Type conversion can be done from one datatype to another bu twhile doing so only lower data type to higher is recommended coz
//    if we do the conversion from higher to lower we may get some corrupted or missing values
    val intType = 12
    val LongType = intType.toLong()
    println(intType)
    println(intType::class.java)
    println(LongType)
    println(LongType::class.java)
    val loong = 45678945678945
    val innt = loong.toInt()
    println(innt)//corrupted value is displayed thus it is not recommended
    val stringg: String = innt.toString()
    println(stringg::class.java)
//    val testing = readLine() ?: "0"
//    println(testing.toInt() + 1)

/* toByte()
    toShort()
    toInt()
    toLong()
    toFloat()
    toDouble()
    toString any datatype can be converted to String
 */
//Exercise
    var pi = 3.14159
    println(pi::class.java)
    var convFloat = pi.toFloat()
    println(convFloat)
    var convInt = pi.toInt()
    println(convInt)
    var convString = pi.toString()
    println(convString)
    //Exercise 2
    print("Enter an number: ")
    var num = readLine()?:""
    val numMul =num.toDouble()*pi
    println("multiplyed value:${numMul} and the type is ${numMul::class.java}")

}