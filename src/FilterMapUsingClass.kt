import kotlin.math.hypot

fun main(Args: Array<String>) {

    var people = listOf<person>(person(18, "Arul"), person(20, "kumar")
                   , person(25, "Vasu"), person(30, "Arun"))
    for (i in people    )
        println(i)

    println()
    var names = people.filter { person -> person.name.startsWith("A")  } //it.startsWith
        .map { person ->person.name  } //it.name (As we have one parameter)
    for (i in names)
        println(i)

    println()

}

data class person(var age:Int, var name:String)