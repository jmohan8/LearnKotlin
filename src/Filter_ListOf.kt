

fun main(Args: Array<String>) {
//  var mynumber: List<Int> =   listOf(3,4,434,435,32,21,23)
    var mynumber =   listOf(3,4,434,435,32,21,23)   //Alternate

//    val mysmall = mynumber.filter { v->v>10 }
    val mysmall: List<Int> = mynumber.filter { it >10 } //As we have single parameter we r using IT

    for (i in mysmall)
        println(i)

    println()
    val mysqur = mynumber.map { it * it } //num -> num * num

    for (i in mysqur)
        println(i)

//    filter and squre together

    var mydata = mynumber.filter {it < 25}
                         .map { it * it }
    for (i in mydata)
        println(i)
}