package nakshatratechnohub.com.kotlinprograms

import java.util.*

class Reverse {



}

fun main(){

  val s1= "marry"
    val s2 = "arrmy"

    val n1=s1.length
    val n2= s2.length
    var isAnagram:Boolean=false

     s1.toCharArray().sorted()
     s2.toCharArray().sorted()

  if (s1==s2)

   println("isAnagram is true"  )
  else println("false")
}