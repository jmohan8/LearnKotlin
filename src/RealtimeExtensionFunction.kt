
fun main(Args : Array<String>)
{
    var str1 = " Hello"
    var str2 = " World"
    var str3 = "Hey"

   println(str3.Add(str1))

    var i = 5
    println(i.greaterThan(-1))
}
fun String.Add(s1: String): String
{
    return this + s1
}

infix fun Int.greaterThan(j:Int): Int = if (this>j) this else j
