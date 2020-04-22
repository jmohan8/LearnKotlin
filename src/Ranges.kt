fun main(Args : Array<String>)
{
    var r1 = 1..5           // This range contains number 1, 2, 3, 4, 5
    for (i in r1)
        println(i)

    var r2 = 5 downTo 1      // This range contains number 5, 4, 3, 2, 1
    for (i in r2)
        println(i)

    var r3 = 'a' .. 'z'        // This range contains the values from "a", "b", "c" . . . "z"
    for (i in r3)
        println(i)

    var isPresent = 'F' in r3
    println(isPresent)

    var countdown = 10.downTo(1)      // This range contains number 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
    for (i in countdown)
        println(i)

    var moveup = 1.rangeTo(10)      // This range contains number 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    for (i in moveup)
        println(i)
}