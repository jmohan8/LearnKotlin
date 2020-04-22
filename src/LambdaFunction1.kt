fun main(Args: Array<String>) {
    val obj_myclass = mycls()
    val mylamda: (Int, Int) -> Unit = { a: Int, b: Int -> println("The value of " + (a + b)) }
    obj_myclass.sum(4, 8, mylamda)
}

private class mycls {
    fun sum(x: Int, y: Int, action: (Int, Int) -> Unit) {
        action(x, y)
    }
}