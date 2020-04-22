
fun main(Args : Array<String>)
{
    println(area(width = 10, length = 5) )
}

fun area(length: Int, width: Int, height: Int = 5):Int
{
    return(length+height+width)
}