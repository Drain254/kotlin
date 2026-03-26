fun main(){
    sumUpTo(15)
}
fun sumUpTo(n:Int){
    var sum = 0
    for (number in 1..n){
        sum = sum + number
    }
    println("The answer is $sum")
}
