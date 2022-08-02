fun main(args:Array<String>) {
    println(5+3)
    println(5-2)
    println(5-7)
    println(5*4)
    println(5/2)
    println(5f/3f)
    println(5.0/3.0)
    println(5%3)
//        +
//        -
//        *
//        %
//        /
//
//if we add two string then they will be concatenated
//increment and decrement operators can also be used'
//Exercise
val onekiloMeat=29.99
val totalCost = (1.0/3.0)*onekiloMeat
println(totalCost)
    print("Enter the available amount in the bank: ")
    val availableAmt = readLine()?:""
    println()
    println("As a result of winning the lottery You are balance has been triphled! \nRemaining balance:${availableAmt.toDouble()*3}")
//Exercise2
val interest = 5.5
var principal = readLine()?:"0"
val year = 5
println((principal.toDouble()*year*interest)/100)
//Booleans
    var booleean =true
    var result = readLine()
    if(result.toBoolean()!=true)
        booleean=false
    println(booleean)
//Logical Operators
val isMonday = true
val isTuesday = false
val today = true
if(today&&isMonday)
    println(true)
//Logical operators are &&  ||  !
//AND OR and NOT operators
//comparison operators are operators that reuslt in boolean
//> greater than
//< lesser than
//>= greater than or equal to
//<= Lesser than or equal to
//== quality checks left hand side and right hand side are equal if so returns true or false
//!= will check wether they are different or not if so then true or false

}