
fun main(Args: Array<String>)
{
    var i = 1..10
//    For Loop
    for (i in i )  //for (i in 1..10) //Another Way

        if (i % 2 ==0)
        {
            println(i)
        }

//    While Loop
    var x : Int = 1
    while (x < 5)
    {
        println("Inside While $x")
        x++
    }

//    Do While loop
    x = 1
    do {
        println("Inside Do While $x")
        x++
    } while (x < 5)
}