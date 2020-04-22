fun main(Args: Array<String>)
{
 var obj = square("Rectangle", "blue")
}

open class shape(open var color: String){
    init {
        println("The color is $color")
    }
}
//override variable in Primary constructor
class square(var shp:String, color:String) : shape(color)
{
    init {
       println("the shape is $shp and color is $color")
    }
}