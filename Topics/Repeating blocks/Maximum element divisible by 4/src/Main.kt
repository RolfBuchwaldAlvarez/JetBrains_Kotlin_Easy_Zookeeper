const val DEVISOR = 4

fun main() {
    val repetitions = readln().toInt()
    var result = 0
    repeat(repetitions) {
        val input = readln().toInt()
        if (input % DEVISOR == 0 && input > result) {
            result = input
        }
    }
    print(result)
}