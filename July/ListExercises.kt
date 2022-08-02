fun main(){
    var teams = listOf("AppX-Mail-Android","AppX-Mail-ios","CRM","Appx-mobiles","AppX",null,null)
    println(teams.get(0))
    //or
    println(teams[4])
//    list elements are ordered thus we can access them with their index
//    list  can have duplicate elements
//    list is immutable in kotlin thus we cant add or delete elements
//    if we didnt provide the elements at the time of declaration then we should provide the datatype when we are declaring that is wether they are
//    <String> or any other type
//    can have null value
    println(teams.indexOf(null))
    println(teams)
    println(teams.size)
//List functions
println(teams.size)
println(teams.contains("AppX"))
val subTeams = listOf("CRM","AppX")
println(teams.containsAll(subTeams))
println(teams.lastIndexOf(null))
//Exercise
val winners = listOf("usain","john","Michael","Alex","Bob")
println("Winners are $winners and Michael finished in position ${winners.indexOf("Michael")+1}")
//Exercise
val availableColors = listOf("red","blue","green")
val toPrint = listOf("red","green","blue")
println(availableColors.containsAll(toPrint))
//Exercise
val inngredients = arrayListOf("Chicken","Egg","Mozzarella","Pepper")
println(inngredients)
print("Enter the replacing ingredient: ")
val replacingIngredient = readLine()?:""
print("Enter the ingredient you want to replace with: ")
val removingInngrediennt = readLine()?:""
try {
    inngredients.set(inngredients.indexOf(removingInngrediennt),replacingIngredient)
}
catch (e: java.lang.Exception){
    println("Exception occured and the Exception is $e")
}
finally {
    println(inngredients)
}

}