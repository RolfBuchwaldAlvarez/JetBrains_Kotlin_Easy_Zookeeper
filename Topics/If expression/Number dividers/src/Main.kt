fun main() {
    val num = readln().toInt()
    for (i in listOf(2, 3, 5, 6)) {
        if (num % i == 0) println("Divided by $i")
    }
}