fun main() {
    val number = readln().toInt()
    print(if (number < 0) "negative" else if (number > 0) "positive" else "zero")
}