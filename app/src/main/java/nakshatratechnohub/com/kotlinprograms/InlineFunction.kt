package nakshatratechnohub.com.kotlinprograms


/*
* Inline function instruct to compiler insert the complete body of code when it gets called
 */
class InlineFunction {

    inline fun inLineFn(a:Int,b:Int,fn:(Int,Int)->Int):Unit {
        print(fn(a,b))
    }
}
fun main(){
    val fn:(Int,Int)->Int={
            a,b->a+b
    }
    InlineFunction().inLineFn(20,30,fn)
}