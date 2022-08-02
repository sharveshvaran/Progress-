package August_1

fun main() {
    //in kotlin while is similar to any other while in othr prog languages
    var num:Int = 0
    while (num++<=2){
        println("$num is lesser than or equal to 2")
    }
    val array = arrayOf(1,2,3,2,2,5,6,42,5,3)
    var index:Int=0
    while(index < array.size){
        println(array[index++])
    }
}