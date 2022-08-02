fun main() {
 //iterating in for loop through the in operator
    for(i in 1..10)
        print("$i ")
    println()
    //we can iterate by jumping with the given value that is
    for (i in 1..10 step 4)
        print("$i ")
    println()
    for(i in 10..1)//this for wont execute as the condition itself aint properl. that is we cant iterate the for loop top to down (decreasing)
        print("hi")//without using the down to operator
    for (i in 10 downTo 1 )
        print("$i ")
    println()
    for (i in 13 downTo 0 step 3)
        print("$i ")
    println()
    //iterating an array
    //with in operator
    val arry = arrayOf(1,2,3,4,5,6,5)
    for (value in arry)
        print("$value ")
    println()
    //iterating with index
    for(index in arry.indices)
        print("${arry[index]} ")
    println()
    //iterating with the help of withindex library
    for((index,value) in arry.withIndex())
        println("element $value is at index $index")

        var name = "Moto"
        var name2 = "rola"

        // traversing string without using index property
        for (alphabet in name) print("$alphabet ")

        // traversing string with using index property
        for (i in name2.indices) print(name2[i]+" ")
        println(" ")

        // traversing string using withIndex() library function
        for ((index,value) in name.withIndex())
            println("Element at $index th index is $value")
//    to iterate through collection
    val liist = listOf(1,2,3.3,"Sads")
    for(i in liist)
        print("$i ")

}