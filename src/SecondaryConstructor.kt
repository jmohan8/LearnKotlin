
fun main(Args: Array<String>)
{
    var obj = secondaryCons("Secondary Constructor", 10)
}

class secondaryCons(var name:String)
{
    var IDno : Int = 0

    init {
        println(name)
    }
    constructor(n:String, id: Int):this(n)
    {
        this.IDno = id
        println("inside Secondary constructor $IDno $id")
    }
}