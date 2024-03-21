// import required libraries
import java.util.*

// main function
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // take input
    var n = scanner.nextInt()
    var count = 2
    val fibo = mutableListOf<Int>()
    //  initialize the first two integers of the Fibonacci series to 0 and 1 respectively
    var t1 = 0
    var t2 = 1
    fibo.add(t1)
    fibo.add(t2)
    // Write your "while" loop code here to complete the series
    while (count++ < n) {
        val sum = t1 + t2
        t1 = t2
        t2 = sum
        fibo.add(sum)
    }
    print(fibo.joinToString())
}

