
fun main(Args : Array<String>)
{
    fun areaOfRectangle(l : Int, b: Int): Int      //Function With Return (type Int)
    {
        return ( l * b)
    }
    println(areaOfRectangle(5,6))
    areaOfsquare(4)
}
fun areaOfsquare(a : Int) : Unit                //Void function or not return type
{
    println(a * a)
}