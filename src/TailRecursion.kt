
fun main(Args: Array<String>)
{
println(factorial(10))
}

/* Tail call optimization is way in which
For recursive calls to function No New Stack Frame is Allocated.”
It avoids the Stack overflow error
 */

tailrec fun factorial (num: Int, op: Int = 1): Int{
    return if (num == 0) op
    else
        factorial(num - 1, op * num  )

}