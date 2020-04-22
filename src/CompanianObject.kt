fun main(Args: Array<String>) {

    println(myclass.i)
    myclass.meth()

}

class myclass {
    companion object
    {
        var i = 10
        @JvmStatic  //if we want to access the below method in java we need to add jvm annotation
        fun meth() {
            println("mymethod")
        }
    }
}
