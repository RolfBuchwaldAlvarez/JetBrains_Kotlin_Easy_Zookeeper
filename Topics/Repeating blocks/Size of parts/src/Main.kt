fun main() {
    val numberOfParts = readln().toInt()
    var numberOfPerfectComponents = 0
    var numberOfLargerComponents = 0
    var numberOfSmallerComponents = 0
    repeat(numberOfParts) {
        when (readln().toInt()) {
            -1 -> numberOfSmallerComponents++
            1 -> numberOfLargerComponents++
            0 -> numberOfPerfectComponents++
        }
    }
    print("$numberOfPerfectComponents $numberOfLargerComponents $numberOfSmallerComponents")
}