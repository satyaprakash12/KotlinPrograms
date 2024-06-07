package nakshatratechnohub.com.kotlinprograms

class Test1 {
}

fun main(){
//    var n1=0
//    var n2=1
//    var n3=0
//    var n=20
//    println(n1)
//    println(n2)
//    while (n>0){
//        n3=n1+n2
//        println(n3)
//        n1=n2
//        n2=n3
//        n -= 1
//    }

    var a = intArrayOf(20,30,40,7,7)
    val n=a.size
    var temp=0

    for (i in 0 until n-1)
    {
        for (j in i until n-1){
           if (a[i]>a[j+1]) {
               temp=a[i]
               a[i]=a[j+1]
               a[j+1]=temp
           }
        }
    }
    println("${a.joinToString()}")

}