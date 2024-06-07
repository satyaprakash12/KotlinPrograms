package nakshatratechnohub.com.kotlinprograms


/*
* HigherOderFunction, when a function accepts  function as parameter or return a function is called higherOder
* Function
 */
class HigherOderFunction {
    inline fun higherOderFunction(a:Int,b:Int,fn:(Int,Int)->Int):Unit {
        print(fn(a,b))
    }
}
fun main(){
    val fn:(Int,Int)->Int={
        a,b->a+b
    }
    HigherOderFunction().higherOderFunction(20,30,fn)
}