const val D = 2
const val C = 3
const val B = 4
const val A = 5

fun main() {
    val numberOfStudents = readln().toInt()
    var amountOfA = 0
    var amountOfB = 0
    var amountOfC = 0
    var amountOfD = 0
    repeat(numberOfStudents) {
        when (readln().toInt()) {
            A -> amountOfA++
            B -> amountOfB++
            C -> amountOfC++
            D -> amountOfD++
        }
    }
    print("$amountOfD $amountOfC $amountOfB $amountOfA")
}