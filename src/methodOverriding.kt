
fun main(Args: Array<String>) {
    var obj = b( )
    obj.display()

}

open class a
{
    open var txt : String = "Hello"         //We can override variable also in the sub class
    open fun display()
    {
        println("inside class a")
    }

}
class b : a()           //if we call interface and interface also
                        // have display method we can use super<class>.display
{
    override var txt : String = "World"
    override fun display()
    {
        super<a>.display()
        println("Inside class b")
        println(super.txt +" " + txt)
    }
}