fun identity(number: Int): Int = number
fun half(number: Int): Int = number / 2
fun zero(number: Int): Int = 0

fun generate(functionName: String): (Int) -> Int {
    return when (functionName) {
        "identity" -> ::identity
        "half" -> ::half
        else -> ::zero
    }
}