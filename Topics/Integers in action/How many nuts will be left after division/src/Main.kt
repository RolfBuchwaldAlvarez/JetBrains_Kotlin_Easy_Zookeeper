fun main() {
    val squirrels = readln().toInt()
    val nuts = readln().toInt()
    val nutsLeftAfterSharing = nuts % squirrels

    println(nutsLeftAfterSharing)
}