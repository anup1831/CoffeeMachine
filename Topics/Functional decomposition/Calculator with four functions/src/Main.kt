// Implement your functions here
fun subtractTwoNumbers(a: Long, b: Long) {
    println(a - b)
}

fun sumTwoNumbers(a: Long, b: Long) {
    println(a + b)
}

fun divideTwoNumbers(a: Long, b: Long) {
    if (b == 0L) {
        println("Division by 0!")
    } else {
        println(a / b)
    }
}

fun multiplyTwoNumbers(a: Long, b: Long) {
    println(a * b)
}

/*fun main() {
    subtractTwoNumbers(6, 5)
    sumTwoNumbers(5, 6)
    divideTwoNumbers(5, 0)
    multiplyTwoNumbers(5, 6)
}*/
