package August_1

fun main(){
    //string in kotlin is same as in java they are immutable
    var string1 = "sharvesh"
    val string2: String
    string2= "sda"
    //here string2 hasnt been assigned though val can be only assigned once since there is not any assignment it is valid
    println(string1)
    println(string2)
    //accessing the string characters through indexing
    println(string2[2])
    //String elements are anything within the double quotes
    //above are the examples
    for(i in string2.indices)
        print(string2[i]+" ")
    println()
    for (i in 0..string1.length-1)
        print(string1[i]+" ")
    println()
    for (i in string2)
        print(i+" ")
    println()
    //above are some ways to iterate the given string
    //String templates are used to evaluate and return an string
    val a = 123
    val b = 435
    val stringTemplate1 = "$a"
    val stringTemplate2 = "$b"
    val stringTemplate3 = "${a*b}"
    println("$stringTemplate1 X $stringTemplate2 = $stringTemplate3")
    //above are the examples for string templates
    //for expression we use ${ }
    //for variables we use $
    //some useful properties and functions in string
    println(string2.length)
    println(string1.get(3))
    println(string1.subSequence(0,4))
    println(string2.compareTo(string2))//if 0 then they are equal
    println(string2.compareTo("sds"))//else they are not same
    //escaped string are the string with escape sequences
    val escapesString = "printing newline\nleaving a tab space in the second line\t and printing a new line again\n:)"
    println(escapesString)
    //to check the equality between two string we use == operator but by default it is turned inton equal() function
    println(string2==string1)
    println(string2=="sda")
    //The referential equality in Kotlin is checked through the === operator and its inverse !== operator.
// This equality returns true only if both the instances of a type point to the same location in memory.
    val string3="sda"
    println(string2==="sda")
    println(string2===string3)//since the object sda is already present in the string constant pool the address of that object is returned thus
    //they both point to the same object and thus it returns true
    println(string1===string2)
    //multi line string raw string
    var multiLineString = """hi
        |my name is sharveshvaran
        |I am from India
        |bye.:)
    """.trimMargin()
    println(multiLineString)
    //throug array of characters
    val arrayofChar = charArrayOf('s','h','a','r','v','e','s','h')
    arrayofChar[2]='y'
    println(arrayofChar)//here we can modify the element which is mutable despite having val coz we aint reassigning arrayofchar we are just
    //modifying one of its element

}