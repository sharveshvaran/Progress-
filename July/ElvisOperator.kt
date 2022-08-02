fun main(args:Array<String>) {
    var nameofCat: String? = null
    nameofCat = "kkitty"
    println(nameofCat?:"it has null value")
//    thats how we use an elvis operator if the provided value is null then the default value after the colon gets printed
//    !!. non-null assertion operator is used to byepass all languages that the variable is not null thus we have to make sure that that the variable is nit null or else we ill expect exception
val costofProd=29.99
val noofProd= readLine()
val total = noofProd?.toInt()?:3
    println("${total*costofProd}")
    val ability:Int = 7//incase if I  provide a string then there arises an ewrror because kotlin is statically typed that is the error os known at compile time

}