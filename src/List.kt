fun main(Args: Array<String>) {

    //Listof (Immutable, Fixed size, READ-ONLY)
    var list = listOf<String>("Monday", "Tuesday", "Wednesday"
                             ,"Thursday", "Friday")

    for (i in list)
        println(i)
    println()
    for(index in 0..list.size - 1)
        println(list[index])
}