fun main(){
    val username: String ="admin"
    val password: String ="sgad1234"
    val isblocked: Boolean =true
    if ((username =="admin"||username=="manager") && password.length>=8 && !isblocked){
        println("login successful")
    }else{
        println("login failed")
    }
}