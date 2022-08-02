package August_2

fun main() {
 //in kotlin break is similar to any other languages it will exit the current loop
 for(i in 1..10){
  println("for")
  if(i==5)break}
 //while
 var num =0
 while(num++<Int.MAX_VALUE)if(num==10)break
 //do-while
 var number1 = 0
 do{
  println("hi")
  if(number1++>5)break
 }while (true)
 //labeled break
 //labeled break can be done by specifying the label name and followed by an @sign
 var i =0
 firstloop@
 do {
  secondLoop@
  while (true) {
   println("by")
   if (i++ > 10)
    break@firstloop
  }
 }while (true)
}