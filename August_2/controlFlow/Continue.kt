package August_2

fun main() {
    //continue will skip the current iteration of the loop
    outer@
    for(i in 1..100){
        if(i%2==0)
            continue
        println(i)
    }
    //labeled continue will skip[ the iterations below and move them to the labeled loop
    outer@ for (num1 in 4 downTo 1) {

        inner@ for (num2 in 4 downTo 1) {
            if (num1 <= 3)
                continue@outer
            println("num1 = $num1; num2 = $num2")
        }
    }
}