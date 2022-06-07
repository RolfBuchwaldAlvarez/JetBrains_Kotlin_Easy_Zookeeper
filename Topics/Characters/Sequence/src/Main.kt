fun main() {
    val firstChar: Char = readln().first()
    val secondChar: Char = readln().first()
    val thirdChar: Char = readln().first()
    println(firstChar == secondChar - 1 && thirdChar == secondChar + 1)
}