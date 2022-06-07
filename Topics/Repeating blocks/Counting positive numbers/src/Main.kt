fun main() {
    val repetitions = readln().toInt()
    var amountOfPositiveNumbers = 0
    repeat(repetitions) {
        val input = readln().toInt()
        if (input > 0) amountOfPositiveNumbers++
    }
    print("$amountOfPositiveNumbers")
}