package nakshatratechnohub.com.kotlinprograms

class RemoveDuplicate {
   // Remove Duplicates from a array



}

fun main(){
    var list= arrayOf<Int>(20,10,20,30,0,1,23,1)
    var set = mutableSetOf<Int>()
    for (i in list){
        set.add(i)
    }
    println(set)
}