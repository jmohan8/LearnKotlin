@file: JvmName("MyKotlin")
fun main(Args: Array<String>)
{
    println(add(2,3))
    println(add(3,4,5))
}

@JvmOverloads               //used to access the less paramenter in the java file
fun add(a:Int, b:Int, c:Int = 10) : Int
{
    return a + b + c
}