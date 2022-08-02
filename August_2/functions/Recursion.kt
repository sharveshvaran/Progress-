package August_2.functions
fun sum(array:Array<Int>,index:Int):Int{
    return if(index<=0)0
    else (sum(array,index-1) + array[index-1])
}
fun main() {
    val arry = arrayOf(1,2,3,4,5)
    println(sum(arry,arry.size))
}