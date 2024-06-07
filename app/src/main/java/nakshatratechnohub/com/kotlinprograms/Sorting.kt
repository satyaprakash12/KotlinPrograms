package nakshatratechnohub.com.kotlinprograms

class Sorting {
}

fun main(){
    var list= mutableListOf<Int>(10,30,40,1,30)
    var tmp=0
    val n=list.size
    for (i in 0 until n-1)
    {
        for (j in i until n-1  ){
            if (list[i]>list[j+1]){
                tmp=list[i]
                list[i]=list[j+1]
                list[j+1]=tmp
            }
        }
    }
    println(list)
}