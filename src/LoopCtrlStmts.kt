
fun main(Args : Array<String>)
{
    for( i in 1..10)
    {
        println(i)
        if (i == 2)
            break
    }

    myloop@ for (x in 1..3)     //labeled For loop
    {
        for (y in 1..3)
        {
            println("$x $y")
            if (x == 2 && y ==2)
                break@myloop
        }
    }

    for (i in 1..10)
    {
        if (i % 2 == 0)
        {
            continue
        }
        println(i)
    }

    outer@ for (x in 1..3)     //labeled For loop
    {
        for (y in 1..3)
        {
            if (x == 2 && y ==2)
                continue@outer
            println("$x $y")
        }
    }
}