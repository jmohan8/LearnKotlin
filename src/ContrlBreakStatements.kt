
fun main(Args: Array<String>)
{
    var a  = 10
    var b  = 4

    var result : Int =  if (a  > b)
                        a
                        else
                        b
    print(result)

    var x = 5
    var str : String
    when(x)
    {
        0,1,2 -> println("X values is $x")
        5,6,7 -> println("X value is $x")
        8,9,10 ->
        {
            println("Xvalue is")
            print(x)
        }
        in 11..15 -> println("Value of X is $x")
        !in 20..25 -> println("X value is $x")
        26 -> {
            str = "String Value assigning"
            println(str)
        }
    }

    var y : String = when(x)
    {
        1-> "Value is 1"
        2-> "Value is 2"
        else -> "Value is non"
    }
    println(y)

}