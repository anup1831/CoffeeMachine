import kotlin.math.pow

fun main() {
    when (readln()) {
        "amount" -> println(calculateFinalAmount(startingAmount = readln().toInt()))
        "percent" -> println(calculateFinalAmount(yearlyPercent = readln().toInt()))
        "years" -> println(calculateFinalAmount(years = readln().toInt()))
    }
}
fun calculateFinalAmount(startingAmount: Int = 1000, yearlyPercent: Int = 5, years: Int = 10): Int {
    return (startingAmount.toDouble() * (1 + yearlyPercent.toDouble() / 100.toDouble()).pow(years)).toInt()
}

