fun main(Args: Array<String>) {
    var obj_withApply = with_apply()

/*  obj_withApply.name = "Myname"
    obj_withApply.id = 20
    obj_withApply.startrun()
  //Eachtime we have to mention object name to access the member of the class
  // we can use with and apply and it will be useful in Android Development
 */
    with(obj_withApply)
    {
        name = "Myname"
        id = 20
    }
    obj_withApply.apply {
        name = "MynewName"
        id = 30
    }.startrun()
    println(obj_withApply.name)
    println(obj_withApply.id)
}

class with_apply
{
    var name: String = ""
    var id: Int = 0

    fun startrun()
    {
        println("Ready to run")
    }

}