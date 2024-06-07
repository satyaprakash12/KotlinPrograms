package nakshatratechnohub.com.kotlinprograms

class Program {
}

fun main(){

    printPattern(4)
}

fun printPattern(n:Int){
    var k=n
    for (i in 1..n*n step n){
        for (j in i..k){
            print(j)
        }
        k += n
        println(" ")
    }
}