// when statement
fun main(){
    val marks : Int =56
    when(marks){
        // in to specify the range
        in 1..30 ->println("your marks are $marks - below average")
        in 31..50 -> println("your marks are $marks - average")
        in 51..70 ->println("your marks are $marks -excellent")
        else -> println("you've passed")
    }
}