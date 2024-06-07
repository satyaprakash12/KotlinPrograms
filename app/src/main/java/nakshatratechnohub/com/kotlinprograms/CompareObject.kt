package nakshatratechnohub.com.kotlinprograms

import java.util.Arrays.hashCode

class CompareObject {
}
fun main(){
    val str="satya"
    val str1="satya"
    val str2="prakash"
    println(str==str1)
    println(str.equals(str2))

    val a=10
    val b=10
    val c=20
    println(str.codePoints() )
    println(str1.hashCode())
    println(str2.hashCode())
    println(b.hashCode())
    println(a.equals(b))
    println(a.equals(c))
}