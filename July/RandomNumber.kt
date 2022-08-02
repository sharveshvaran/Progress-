import kotlin.random.Random
import kotlin.random.nextInt

fun main(args:Array<String>) {
    println(Random.nextInt())//to print a random number
    println(Random.nextInt(3))//to specify upto what number we should print
    println(Random.nextInt(3,6))//from whaich number to which number should the random number be generated
    println(Random.nextInt(6,7))
    println(Random.nextDouble())
    println(Random.nextDouble(44.4))
    println(Random.nextDouble(44.4,45.44))
    //we can generate random numbers specifying the function of the type we need we will gret thte value

}