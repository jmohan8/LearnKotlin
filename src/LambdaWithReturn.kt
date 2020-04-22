@file:Suppress(
    "SpellCheckingInspection", "SpellCheckingInspection", "SpellCheckingInspection",
    "SpellCheckingInspection"
)

fun main() {
    val objmyclass = Myclas()
//    var mylamda : (Int, Int) -> Int = {a:Int ,b:Int -> println("Inside lamda")
//                                                                a + b }
//    obj_myclass.sum(4,8,mylamda)
//                           Simplyfy the above code
//    obj_myclass.sum(4,8) { a:Int, b:Int -> println("Inside lamda")
//        a + b }
//            Alternate ways to use lambda functions
    objmyclass.sum(4, 8) { a, b -> a + b }     //Both are correct
    objmyclass.sum(4, 8) { a, b -> a + b }       //Both are corret
}

private class Myclas {
    fun sum(x: Int, y: Int, mylamvar: (Int, Int) -> Int) {
//        var result = mylamvar(x,y)
//                  Simplyfy the above code
        println("the value of total is " + mylamvar(x, y))
    }
}
