package August_2.functions

import java.math.BigInteger

tailrec fun factorial(num:BigInteger,result:BigInteger= BigInteger.ONE):BigInteger{
    return if(num== BigInteger.ONE)
        result
    else
        factorial(num- BigInteger.ONE,result*num)
}
fun main() {
    var big=BigInteger("100000")
    println(factorial(big))
}
//tailrec word optimizes the compiler that is
//Tail recursion is a recursion which performs the calculation first, then makes the recursive call.
// The result of current step is passed into the next recursive call.
//Tail recursion follows one rule for implementation. This rule is as follow:
//The recursive call must be the last call of the method.
// To declare a recursion as tail recursion we need to use tailrec modifier before the recursive function.

//understanding :
/*in Tail recursion the code should be in a way that there isnt any prnding calculations that is before the function call all the calculations
 must be done. example:
         factorial(num- BigInteger.ONE)*num
         in this after the function call only the calculations will be executed so calculations will be pending. so this aint tail recursion
         */