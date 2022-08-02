fun main() {
    val array1 = arrayOf(1,2,3,4,5)//without specifying the type
    for(i in 0..array1.size-1)
        print("${array1[i]} ")
    println()
    for(i in array1)
        print("$i ")
    println()
    val array2 = arrayOf<String>("sharvesh","vignesh","rishi","raghul")//by specifying the type
    for(i in array2)
        print("$i ")
    println()
    for (i in 0..array2.size-1)
        print("${array2[i]} ")
    println()
    //array can be created by using array class's constructor but after learning lambda expression we will practice it
    //there are also some factory methods available but not part of the array class which are used to create array
    val array3 = arrayOf<Double>()
    println(array3.size)
    //default size of an array is 0
    val array4 = Array(5){"Default"}
    array4.forEach { index-> println(index) }
    //get is used to acces the element from an array and set is used to set an eleement that is to modify it
    println( array2.get(3))
    array4.set(0,"1st element")
    array4.forEach { index-> print(index+" ") }
    //one can also modify the elements using [] operator it is an overloaded operator
    //which we will see later




}