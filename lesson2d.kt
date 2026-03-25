fun main(){
    val marks : Int = 85
    if(marks<=0 || marks>100){
        println("invalid marks")
    }else if(marks>=0 && marks <=30){
        println("you've failed")
    }else if(marks>30 && marks<=50){
        println("average student")
    }else if(marks>50 && marks<=70){
        println("above average")
    }else{
        println("excellent")
    }
}