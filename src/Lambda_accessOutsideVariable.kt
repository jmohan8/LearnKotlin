fun main(Args: Array<String>)
{
    var obj_lamb = lambda_access_OutsideVariable()
    var sum = 0

    //modify the outside variable inside lambda is not possible in JAVA
    obj_lamb.lamb_method(5,4) {x , y-> sum = x + y}
    println(sum)
}

class lambda_access_OutsideVariable
{
    fun lamb_method(a: Int, b:Int, mylamb: (Int, Int) -> Unit)
    {
        mylamb(a,b)
    }
}