// a function with parameters to add two numbers
fun main(){
    add()
    number()
}
fun add(){
    val num1: Int = 12
    val num2: Int = 43
    val answer : Int= num1 + num2
    println(answer)
}
fun number(){
    for (value in 1..20){
        if (value % 2 == 0){
        println("Even $value")
        }else{
            println("Odd $value")
        }
    }
}