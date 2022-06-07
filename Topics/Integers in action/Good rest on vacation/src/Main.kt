fun main() {
    val durationInDays = readln().toInt()
    val totalFoodCostPerDay = readln().toInt()
    val oneWayFlightCost = readln().toInt()
    val costOfOneNightInAHotel = readln().toInt()

    fun totalSum(): Int {
        val totalFoodCosts = durationInDays * totalFoodCostPerDay
        val totalHotelCosts = (durationInDays - 1) * costOfOneNightInAHotel
        val totalFlightCost = 2 * oneWayFlightCost
        return totalFoodCosts + totalHotelCosts + totalFlightCost
    }

    println(totalSum())
}