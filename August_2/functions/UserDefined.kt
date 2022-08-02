package August_2.functions

fun clap(times:Int):Unit{
    for(iterate in 1..times)
        print("clap ")
}
fun main(){
    println("congratulation on this basic function you as for the reward you can recieve claps from the audience")
    print("Enter how many times you want them to clap: ")
    clap(readln().toInt())
}