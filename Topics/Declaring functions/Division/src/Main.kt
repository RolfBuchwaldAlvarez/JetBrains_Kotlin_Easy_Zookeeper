fun divide(number1: Long, number2: Long): Double = number1.toDouble() / number2.toDouble()

/* Do not change code below */
fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}