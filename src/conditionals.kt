fun main() {
    oodNums()
    val nameArray=takeIn("rebecca","pauline","mercy")
robot(20)
    robot(4)
    robot(50)
    line()

}

fun oodNums(){

    for( numbers in 1..100){
        if(numbers%2==0){
          println(numbers)
        }
    }
}
fun takeIn(nam1:String,nam2:String,nam3:String):Array<String>{
    val nameArray=arrayOf(nam1,nam2,nam3)
    for(names in nameArray){
        if(names.length>5){
            println(names)
        }
    }
    return(nameArray)

}
fun robot(age:Int){
    if(age<6){
        println("milk")
    }
    else if(age<15 && age>6){
        println("fanta orange")
    }
    else("cocacola")
}
fun line(){
    for(m in 1..100) {
        println(m)
    }
    for (m in 1..100){
        if(m%3==0){
            println("fizz")
        }

            if(m%5==0){
                println("buzz")
            }

        if (m%3==0 && m% 5==0){
            println("fizzbuzz")
        }
    }


}