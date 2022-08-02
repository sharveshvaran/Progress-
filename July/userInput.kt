fun main(args:Array<String>) {
    print("Enter the input: ")
    var userInput = readLine()?:""//the reason for using ?:"" is to avoid the null value that is if the value is empty and further that value is used in the code
    // to avoid nullvalue exception we use ?:
    println(userInput.toInt()*5)
//    with the help of readLine we can get the input from the user
//    readLine will only read one line
//    and readLine is read as string
//we can convert the string to integer by using toInt
    print("Enter your name: ")
    var userName = readLine()
    println("hi $userName welcome to ZohoCorp")
}