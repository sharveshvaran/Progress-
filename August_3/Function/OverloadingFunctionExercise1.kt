package August_3

fun calculateWithTax(product:String,price:Double=4.5){
    println("the price of the product $product is ${price*0.2}")
}
fun calculateWithTax(product:String){
    println("the price of the product $product ")
}
fun calculateWithTax(map:Map<String,Double>){
    for(item in map)
        calculateWithTax(item.key,item.value)
}
fun calculateWithTax(product:String,price:Double=3.4,total:Double){
    println("the product $product is ${price*0.2}")
}
fun main() {
    calculateWithTax("Laptop")
    calculateWithTax(mapOf("tablet" to 14432.0,"headphone" to 3241.0))
}
//in function overloading if two function have the same name but different type or no of paramters but if
//we call the function with just one parameter which is common for both the function then
//none of the functions can be called with that argument unless default value is provided
//if the default value is provied