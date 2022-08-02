package August_2

import java.util.Scanner

fun main(){
    val num = readLine()
    when(num?.toInt()){
        1-> println("one")
        2-> println("two")
    }
    //when as an expression else part must be there unless it wont proceed to else
    val lastVal = when(num?.toInt()) {
        1 -> 1
        2 -> 2
        else -> 3
    }
    println(lastVal)
    //combining multiple conditions in one go
    when(num?.toInt()){
        1,2,3,4-> println("value less than 5")
        else-> println("greater than 5")
    }
    //using in operator
    val number = num?.toInt()
    when(number){
         in 1..2 -> println("1 to 2")
         !in 1..10 -> println("not in 1 to 10")
    }
    val inp = Scanner(System.`in`)
    val num2:Any = inp.next()
    //we would get an error if we use num as input in when because the input we got from num is through readline which we know
    // for sure it is an string thus checking it for int would throw an error thus we use Any type
    when(num2){
        is Int-> println("integer")
        is String-> println("String")
    }

    fun isOdd(x: Int) = x % 2 != 0
    fun isEven(x: Int) = x % 2 == 0

        var nu = 8
        when{
            isOdd(nu) ->println("Odd")
            isEven(nu) -> println("Even")
            else -> println("Neither even nor odd")
    }

}