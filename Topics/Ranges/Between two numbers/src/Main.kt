fun main() {
    // write your code here
    val firstNumber: Int = readln().toInt()
    val secondNumber: Int = readln().toInt()
    val thirdNumber: Int = readln().toInt()
    println(if (firstNumber in secondNumber..thirdNumber) true else false)
}
