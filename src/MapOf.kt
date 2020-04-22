fun main(Args: Array<String>) {
//    Immutable, FixedSize, READ-ONLY
    var mymap = mapOf<Int, String>(1 to "Mon", 2 to "Tue", 3 to "Wed", 4 to "Thu", 5 to "Fri")

    for (i  in mymap.keys) {
        println("Element in keys: $i = ${mymap[i]}")           //mymap.get(i) this is also right
    }
}