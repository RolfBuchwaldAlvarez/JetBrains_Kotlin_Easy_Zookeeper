fun main() {    
    val recommendedSleep = readln().toInt()
    val excessSleep = readln().toInt()
    val sleep = readln().toInt()

    if (sleep in recommendedSleep..excessSleep) {
        print("Normal")
    } else if (sleep >= excessSleep) {
        print("Excess")
    } else {
        print("Deficiency")
    }
}