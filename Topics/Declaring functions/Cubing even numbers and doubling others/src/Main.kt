// Importing required libraries
import kotlin.math.pow

// Start writing your function here.
// You may decide to name your function whatever you prefer
fun main() {
/*
 * This function should take a parameter of type integer. It should return a value.
 * If the provided integer is even, it should return the cube of that number.
 * Otherwise, it should return double that number.
 */
    val num = readln().toInt()
    println(yourFunctionName(num))
}
fun yourFunctionName(number: Int) = if (number % 2 == 0) number.toDouble().pow(3).toInt() else number * 2


    /*
 * Note: to cube a number in Kotlin, you can use the 'pow' function, like this: number.toDouble().pow(3).toInt()
 * Note2: to check if a number is even in Kotlin, you can use the modulo operator '%', like this: number % 2 == 0
 * Note3: to double a number in Kotlin, you can use the '*' operator, like this: number * 2
 */

