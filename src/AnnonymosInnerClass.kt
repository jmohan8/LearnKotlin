
fun main(Args: Array<String>) {
    var obj_demo : demo = object : demo {
        override fun Prnt() {
            println("anonymous Inner class ")
        }
    }
    obj_demo.Prnt()
}
interface demo{
    fun Prnt()
}