fun main(Args: Array<String>) {

    var obj_mycls = myclss()
    obj_mycls.sum(8,9,object : myinter
                            {
                                override fun calculate(sum:Int)
                                {
                                    println("The value of total is $sum")
                                }
                            }
                )
    }
private class myclss
{   var sum : Int = 0
    fun sum(a:Int, b:Int, action: myinter)
    {
        action.calculate(a+b)
    }
}
interface myinter
{
    fun calculate(sum:Int)
}