package nakshatratechnohub.com.kotlinprograms


/*
* Extension Function provides the facility to add a method in class without modifying the Existing class.
 */
class ExtensionFunction {
    companion object{
        fun sum(a:Int,b:Int):Int{
            return a+b
        }
    }

}

fun ExtensionFunction.add(a:Int,b:Int,c:Int):Int{
    return a+b+c
}
fun main(){
   println(ExtensionFunction.sum(20,30))
   print(ExtensionFunction().add(20,30,40))
}

