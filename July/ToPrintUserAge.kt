import java.time.Year

    fun main(args:Array<String>){
        print("Enter your birth Year: ")
        val birthYear = readLine()?:""
        println()
        val currentYear = Year.now().value
        if(birthYear.toInt() > currentYear)
            println("Bruh! u have not yet born")
        else
        println("Your age is: ${currentYear-birthYear.toInt()}")

    }

