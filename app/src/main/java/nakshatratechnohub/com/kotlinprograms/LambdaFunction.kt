package nakshatratechnohub.com.kotlinprograms


/**
 *  Lambda function are concise, unnamed, enclosed with curly braces and used for defining code
 *  of block that is assigned as values to a variable or passed as values
 */
class LambdaFunction {
 val sum:(Int, Int,)->Int={a,b->a+b}
val name:String="satya prakash"

}

fun main(){
    val ob=LambdaFunction()
    println(ob.sum(20,30))
}