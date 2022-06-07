fun main() {
    val input: Char = readln().first()
    println(input.isUpperCase() || input.isDigit() && input != '0')
}