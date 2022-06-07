const val NINE = 9
const val TEN = 10
const val NINETYNINE = 99
const val HUNDRED = 100

fun main() {
    val numbers = MutableList<Int>(HUNDRED) { 0 }
    numbers[0] = 1
    numbers[NINE] = TEN
    numbers[NINETYNINE] = HUNDRED

    // do not touch the lines below 
    println(numbers.joinToString())
}