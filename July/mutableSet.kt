fun main() {
    val numbers = hashSetOf(2,2,3,2,313,3434,32,53,6,3,null,null)
    println(numbers)
    //hashset is mutable we can add or remove elements
    //it can have null value but only one null value
    //set cant have duplicate elements they have unique values
    val colors = hashSetOf("red","green",null,"blue","yellow","red")
    println(colors)
    colors.add("white")
    val sampleList = listOf(100,200,33333)
    numbers.addAll(sampleList)
    println(numbers)
    println(colors)
    print(numbers.remove(9))
    //functions
//    addAll,removeAll

}