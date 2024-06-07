package nakshatratechnohub.com.kotlinprograms

class Program2 {

    fun count(string: String):Map<Char,Int>{
        val map= mutableMapOf<Char,Int>()

        for (char in string){
            var count=map[char]?:0
            count++
            map[char]=count
        }

        return map
    }

}

fun main() {
    val count=Program2().count("satya prakash")
   for ((char, frequency) in count){
       println("$char:$frequency")
   }

    var str:String="satya"
  println(str)
    str="satya prakash"
    println(str)
}