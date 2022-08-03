package August_3
//if inside an print statement
fun lifeSpan(animal:String):Int{
    val animalist = hashMapOf<String,Int>(Pair("Lion",25),Pair("dog",15))
    var span:Int=0
    for(i in animalist.keys)
        if(i==animal)
            span = animalist[animal]?:0
    return span
}
fun main() {
    println("Enter the animal name:")
    val input = readLine()?:""
    val rsult = lifeSpan(input)
    println(if (rsult==0)"animal not found" else rsult)//if "if" used as an expression then there must be both main and else block

}