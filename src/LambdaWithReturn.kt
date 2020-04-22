fun main(Args: Array<String>) {
    val obj_myclass = myclas()
//    var mylamda : (Int, Int) -> Int = {a:Int ,b:Int -> println("Inside lamda")
//                                                                a + b }
//    obj_myclass.sum(4,8,mylamda)
//                           Simplyfy the above code
//    obj_myclass.sum(4,8) { a:Int, b:Int -> println("Inside lamda")
//        a + b }
//            Alternate ways to use lambda functions
    obj_myclass.sum(4, 8, { a, b -> a + b })     //Both are correct
    obj_myclass.sum(4, 8) { a, b -> a + b }       //Both are corret
}

private class myclas {
    fun sum(x: Int, y: Int, mylamvar: (Int, Int) -> Int) {
//        var result = mylamvar(x,y)
//                  Simplyfy the above code
        println("the value of total is " + mylamvar(x, y))
    }
}