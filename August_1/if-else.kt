package August_1

import java.util.Scanner

fun main() {
    //in if conditional statement the true block gets executed if the condition is true or the else block gets executed
    if(10>3)
        println("10 is greater than 3")
    //if -else
    val a=2
    val b=3
    if(a>b) println("$a is grater than $b")else println("$b is greater than $a")
    //the above if lese candition can be made as an expression
    val max = if(a>b){ println("$a is grater than $b")
        a } else {println("$b is greater than $a")
        b}
    println(max)
    //thus there ain't need for the ternanry operator as the if else itself acts as one
    val input = Scanner(System.`in`)
    val num1 = input.nextInt()
    val num2 = input.nextInt()
    if(num1>num2)
        println("$num1 is greater")
    else if(num1 == 4)
        println("value of num1 is $num1")
    else
        println("$num2 is grater")
    //the above if else-if else van be used in an expression
    val value =  if(num1>num2){
        println("$num1 is greater")
    num1}
    else if(num1 == 4){
        println("value of num1 is $num1")
    num1}
    else{
        println("$num2 is grater")
        num2}
    println(value)

}