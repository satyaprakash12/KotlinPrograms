package nakshatratechnohub.com.kotlinprograms


/**
 * Both Anonymous and lambda are concise, unnamed but difference is that lambda is defined in curly braces and
 * anonymous is usage the fun keyword
 */
class AnonymousFunction {

    val sum:(Int,Int)->Int=fun(a,b):Int{
        return a+b
    }
}
fun main(){
    print(AnonymousFunction().sum(20,30))
}