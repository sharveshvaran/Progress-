fun main(args:Array<String>) {
    val companyName = "ZohoCorp"
    var name = "sharvesh"
    var nameLength = name.length
    println(companyName.length)
    println(nameLength)
    println("ramesh".length)
    //length is an property of string which prints the length of the string it aint an function
    //capitalize is an function that will capitalize the first letter of the word
    println(name.capitalize())
    //decapitalize will make the first letter to lower case
    println(name.decapitalize())
    //trim will remove spaces at the beginning and at the end of the string
    var trimText="      Too many spaces   in the string     "
    println(trimText.trim())
    //get function will get the character in that position
    println(name.get(0))
    //we can also get the character at a position by us ing the sQUARE BRACKETS
    println(name[4])
    //to get the part of the string we can use substring
    println(companyName.substring(4))
    println(companyName.substring(3,6))
}
