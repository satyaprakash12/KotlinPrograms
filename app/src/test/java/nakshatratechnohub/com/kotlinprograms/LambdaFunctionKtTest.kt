package nakshatratechnohub.com.kotlinprograms

import org.junit.Assert.*
import org.junit.Test

class LambdaFunctionKtTest{

    @Test
    fun verifyName(){
     val result=LambdaFunction().name
        assertSame("satya prakash", result)
    }
}