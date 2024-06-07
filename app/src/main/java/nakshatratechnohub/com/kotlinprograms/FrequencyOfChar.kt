package nakshatratechnohub.com.kotlinprograms

class FrequencyOfChar {


}
fun findCharFrequency(input: String): Map<Char, Int> {
    val charFrequency = mutableMapOf<Char, Int>()

    for (char in input) {
        println(char)
        var    count = charFrequency[char] ?: 0
        println(count)
        charFrequency[char] = count + 1
    }

    return charFrequency
}

fun main() {
    val inputString = "hello world"
    val frequencyMap = findCharFrequency(inputString)

    println("Character frequencies:")
    for ((char, frequency) in frequencyMap) {
        println("$char : $frequency")
    }
}
