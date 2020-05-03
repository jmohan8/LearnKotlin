fun main(Args: Array<String>) {

    fun displaystring(vararg str: String) {
        for (string in str) {
            println(string)
        }
    }
    displaystring("hello", "world", "new", "world")
}