fun main(Args: Array<String>) {
    var objProg = program()
    objProg.addtwonumbers(5,9, object : myinterface {
        override fun execute(sum: Int) {
            println(sum)
        }
    })
}
class program{
    fun addtwonumbers(a:Int, b:Int, action: myinterface){
        var sum = a + b
        action.execute(sum)
    }
}
interface myinterface{
    fun execute (sum:Int)
}