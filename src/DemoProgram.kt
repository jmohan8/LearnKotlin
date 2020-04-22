
open class human
{
    open fun think()
    {
        println("Real Thinking")
    }
}
class Alien : human()
{
    override fun think()
    {
        println("Virtual Thinking")
    }
}
class doctor : human()
{
    init
    {
        println ("Critical thinking")
    }
}
fun main(Args : Array<String>)
{
    var novan = doctor()
    novan.think()
}




