fun main(Args: Array<String>)

{
    var user1 = user("sam",  20)
    println(user1)        //if 'Data' is not mention in class then this is the result 'user@7530d0a'
                        //then this is the result user(name=sam, id=20)

    var user2 = user1.copy("peter")     //Copy method
    println(user2)
}


data private class user(var name:String, var id:Int) //: Any() all the classes inherit the Any class by default
