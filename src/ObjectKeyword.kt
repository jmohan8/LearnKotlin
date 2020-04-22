fun main(Args: Array<String>) {
    bookshelf.books.add(book("kotlin", 50))
    bookshelf.books.add(book("dataStructure", 20))
    bookshelf.books.add(book("java", 25))

    bookshelf.showbooks()

}

data class book(var name:String, var Price:Int)

object bookshelf
{
    var books = arrayListOf<book>()
    fun showbooks()
    {
        for (i in books)
        {
            println(i)
        }
    }
}