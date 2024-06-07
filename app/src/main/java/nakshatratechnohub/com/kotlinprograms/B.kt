package nakshatratechnohub.com.kotlinprograms

class B {
}

fun main(){
    val list= arrayOf(0, 1, 0, 1, 0, 0, 1, 1, 1, 0)
    val n=list.size
    var temp=0

    for (i in 0 until n-1){

        for(j in i until n-1){
            if (list[i]>list[j+1]){
                temp=list[i]
                list[i]=list[j+1]
                list[j+1]=temp
            }
        }
    }

    for (i in list)
    println(i)

}