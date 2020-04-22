fun main(Args: Array<String>) {
    var fac = cofm.facMethod()      //calling factory method
    fac.show()
}

class  cofm
{
    companion object
    {
        fun facMethod() : cofm = cofm()
    }
    fun show()
    {
        println("Inshow")       //calling accessing the method using factorymethod of companion object
    }
}