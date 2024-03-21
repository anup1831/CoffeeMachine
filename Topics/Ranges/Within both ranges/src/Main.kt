fun main() {
    val firstNumber = readln().toInt()
    val secondNumber = readln().toInt()
    val firstRange = firstNumber..secondNumber
    val thirdNumber = readln().toInt()
    val fourthNumber = readln().toInt()
    val secondRange = thirdNumber..fourthNumber
    val fifthNumber = readln().toInt()

    println(if (fifthNumber in firstRange && fifthNumber in secondRange) true else false)
}
