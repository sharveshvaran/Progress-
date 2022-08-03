package August_3
fun mult(num:Int)=
    println("${num*17}")
//so in this return shorthand if we print them in the main fnction it shows it is of unit type so in this the return type is the type of the
//last expression in the block
fun main() {
    val num = readLine()?:""
    for(i in 1..3)
    println(mult(num.toInt()))
    println(radius(2))
}
fun radius(radius:Int)=3.14*radius*radius
