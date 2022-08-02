fun main(){
    val numbers = setOf<Int>()//empty set
    // set is immutable cant add or remove elements
    val name = setOf("sharveshvaran","rishwanth","Vignesh","Raghul")
    println(name)
    val animes = setOf("one piece","Naruto","Jijutsu Kaisen","Naruto")
    println(animes)
    //Set can have null value but only one null value
    val nullValueExample = setOf(null,3,3,2,31,4,35,53,5,null)
    println(nullValueExample)
    //val sn = mutableListOf()
    //Set is not ordered and have unique elements
//    animes.forEach {println("naruto")}
}