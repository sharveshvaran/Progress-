fun main(args: Array<String>){
    var totalPopulation = 7500000000
    println("the total population is: $totalPopulation and the type is ${totalPopulation::class.java}")
    val price = 34.4343
    println("the price is :$price and the type is :${price::class.java}")
    var TrueorFalse = true
    println(TrueorFalse::class.java)
//   **********************************************************************************
    //Exercise
    print("Enter the number: ")
    val number = readLine()?:""
    val doubleValue = 67.77
    val multiplyedValue = number.toInt()*doubleValue
    println("multiplying $number and $doubleValue we get $multiplyedValue and its type is ${multiplyedValue::class.java}")

}