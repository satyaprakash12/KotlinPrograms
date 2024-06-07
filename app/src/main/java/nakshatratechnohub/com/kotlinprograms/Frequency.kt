package nakshatratechnohub.com.kotlinprograms

import java.util.*
import kotlin.collections.HashMap

class Frequency {

}




fun main() {
    // Creating a HashMap
    val map: HashMap<Int, Int?>? = HashMap()

    map?.put(0, 10)
    map?.put(1, 20)
    map?.put(2, null)
    map?.put(3, 40)

    println(map)
}