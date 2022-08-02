fun main (){
    val animeList = arrayListOf("One Piece","Naruto","Haikyu","Ao-Ashi","Dragon Ball Z")
    println(animeList)
    println(animeList[3])
    animeList.add("Jijutsu Kaisen")
    println(animeList)
    animeList.add("Bleach")
    println(animeList)
    animeList.remove("Bleach")
    println(animeList)
//    An arrayList is an mutable list where we can add remove elements
    val elements = arrayListOf<String>()
    elements.add("sdsad")
    println(elements)
//    elements = arrayListOf(
    var groupAll = arrayListOf<String>()
    groupAll.addAll(animeList)
    groupAll.addAll(elements)
    println(groupAll)
//Exercise
    println("Welcome to sha's bank")
    println("please enter your details to proceed with you account creation")
    val accountDetails = arrayListOf<String>()
    print("Name: ")
    accountDetails.add(readLine()?:"NA")
    //println()
    print("Mobile: ")
    accountDetails.add(readLine()?:"NA")
    //println()
    println("Dear ${accountDetails[0]}, you have successfully created your account in our bank")
    println(accountDetails)
//Exercise
val items = arrayListOf("laptop","mouse","pen","paper","mug","phone")
items.remove("laptop")
items.remove("mouse")
println(items)
//Functions
val progLanguages = arrayListOf("java","Kotlin","Swift","Cpp")
println(progLanguages)
progLanguages.set(2,"JS")//swift will be replaced by JS
println(progLanguages)
val androidDevelopment =  progLanguages.subList(0,2)
println(androidDevelopment)
androidDevelopment.clear()//removes all the element in the arraylist
println(androidDevelopment)
print(androidDevelopment.isEmpty())
}
