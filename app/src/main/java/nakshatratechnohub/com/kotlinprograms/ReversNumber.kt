package nakshatratechnohub.com.kotlinprograms

class ReversNumber {

    fun reverse(n:Int){
        var number=121
        var reverse=0
        var r=0
        while (number>0){
            r=number%10
            reverse=10*reverse+r
            number /= 10
        }
    }
}