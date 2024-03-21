fun f(x: Double) = when {
    x <= 0 -> f1(x)
    x >= 1 -> f3(x)
    x > 0 && x < 1 -> f2(x)
    else -> "Unknow error" 
}
// implement your functions here
fun f1(x: Double): Double = x * x + 1

fun f2(x: Double): Double = 1 / (x * x)

fun f3(x: Double): Double = x * x - 1
