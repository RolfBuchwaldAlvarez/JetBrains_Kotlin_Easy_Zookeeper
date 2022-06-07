fun isVowel(letter: Char): Boolean {
    val letterAsLowercase: Char = letter.lowercaseChar()
    if (letterAsLowercase in "aeiou") {
        return true
    }
    return false
}

fun main() {
    val letter = readLine()!!.first()
    println(isVowel(letter))
}