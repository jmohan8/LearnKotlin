fun main(Args: Array<String>) {

    //mutableListof (mutable, No Fixed size, READ-WRITE)
//    var list = arrayListOf<String>("Monday", "Tuesday", "Wednesday","Thursday", "Friday")
//    var list = ArrayList<String>()
    var list = mutableListOf<String>("Monday", "Tuesday", "Wednesday","Thursday", "Friday")

    list.add("Saturday")
    list.add("Sunday")

//    list.remove("Monday")
//    list.add(0,"Mon")
//    instead of above we can use the below line also
    list[0] = "Mon"
    for (i in list)
        println(i)

    println()

    for(index in 0..list.size - 1)
        println(list[index])
}