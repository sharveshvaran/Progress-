fun main() {
//    If when is used as an expression, the else branch is mandatory, unless the compiler can prove that all possible
//    cases are covered with branch conditions
    print("Enter:")
    val name: Any = readln()
    when(name){
        "sharvesh"->println("Welcome admin")
        "vignesh"->println("welcome guest")
        else->println("you are not given access")
    }
    //while using when as an expression else part is mandetory
    var smart = when(name){
        "fool"->("yes u r")
        else->("$name u r smart")//if i comment this line then there will be error shown by the compiler
    }
    println(smart)
//is
    when(name){
        is String-> println("entered text is string")
        is Int-> println("entered text is Int")
        is Boolean-> println("entered text is Bool")
        !is String->println("not an string")
    }
    //in
    var number = readln()
    when(number.toInt()){
        in 1..9->println("Single digit number")
        in 10..99->println("doubke digit number")
    }
}