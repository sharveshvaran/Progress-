package August_3
//same function with same name but with different number of parameters
fun add(num1:Int,num2: Int){
println(num1+num2)
}
fun add(num1: Int,num2: Int,num3: Int){
println(num1+num2+num3)
}
fun main(){
    /*add(1,4)
    add(3,5,2)
    printName("Sharvesh")
    printName(listOf("ramesh","suresh","rishi"))
    printName(arrayListOf("koushik","harish","vijay"))*/
    println(size("sharveshvaran"))
    println(size(12))
    println(12.toString().length)
}
//overloading function  must vary with
// the number of paramaters  or with the type of parameters
// not with the return type

//Example 2
fun printName(name:String) {
    print ("Hi $name ")
}
fun printName(name:Collection<String>){
    for(i in name)
        printName(i)
    println()
}
//Example3
fun size(value:Int):Int{
    val valtostr = value.toString()
    //print(valtostr is String)
    return size(valtostr)
}
    fun size(value:String) = value.length