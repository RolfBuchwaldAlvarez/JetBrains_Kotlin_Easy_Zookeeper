import java.util.*

fun main() {
    val num = readln().toInt()
    val result = num in -14..12 || num in 15..16 || num >= 19
    println(
        result.toString().replaceFirstChar {
            if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
        }
    )
}