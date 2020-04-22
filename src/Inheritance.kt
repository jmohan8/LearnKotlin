

fun main(Args: Array<String>)
{
    var objCat = cat()
    objCat.age = 10
    println(objCat.age)
    objCat.meow()
    objCat.color = "Green"
    println(objCat.color)
    objCat.eat("Cat")

    println()

    var objDog = dog()
    objDog.breed = "Husky"
    println(objDog.breed)
    objDog.bark()
    objDog.color = "Black"
    println(objDog.color)
    objDog.eat("Dog")
}

open class animal
{
    var color = ""

    fun eat (ani: String)
    {
        println(ani + " eats food.")
    }
}
class cat : animal()
{
    var age = 0

    fun meow()
    {
        println("Meow")
    }
}
class dog : animal ()
{
    var breed = ""
    fun bark()
    {
        println("Bark")
    }
}