//create the function and add in the class without modify the class
fun main(Args: Array<String>)
{
    var obj = calculate()
    println(obj.add(5,6))
    println(obj.sub(8,6))

}
fun calculate.sub(c: Int, d: Int) : Int
{
    return c-d
}
class calculate
{
    fun add(a: Int, b:Int): Int
    {
        return a + b
    }
}