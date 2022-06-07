import kotlin.math.abs

const val DIVISOR_TO_GET_LAST_DIGIT = 10

fun getLastDigit(digit: Int): Int = abs(digit % DIVISOR_TO_GET_LAST_DIGIT)

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}