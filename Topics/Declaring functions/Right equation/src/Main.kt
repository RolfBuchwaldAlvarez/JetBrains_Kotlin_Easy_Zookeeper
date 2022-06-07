fun isRightEquation(number1: Int, number2: Int, number3: Int): Boolean {
    if (number1 * number2 == number3) {
        return true
    }
    return false
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    println(isRightEquation(a, b, c))
}