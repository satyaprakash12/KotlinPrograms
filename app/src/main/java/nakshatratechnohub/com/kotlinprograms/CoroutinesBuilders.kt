package nakshatratechnohub.com.kotlinprograms

import kotlinx.coroutines.*

fun main() {

    println("Satya Prakash")

    CoroutineScope(Dispatchers.Default).launch{
        println("work started")
        delay(200)
        println("work started")
        withContext(Dispatchers.Main){
            println("Main Thread"
            )
        }
    }
//    GlobalScope.launch {
//
//        delay(500)
//        println("Work is completed")
//    }
//    Thread.sleep(600)
//    println("Main function")
}


val labda:(a:Int,b:Int)->Int={a,b->a+b}
val abd:(a:Int,b:Int)->Int={a,b->a+b}
