package nakshatratechnohub.com.kotlinprograms

class ReverseString {
}

fun main(){
    var str="my name is satya prakash"
    var r=""
    val n=str.length
      val s=str.split(" ")
        println(s)

    val reverseString=StringBuilder()
    for (w in s){
        println(w)
        reverseString.insert(0,"$w ")
    }

  println(reverseString)


}