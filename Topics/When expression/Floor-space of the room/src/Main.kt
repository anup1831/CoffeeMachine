
const val PI = 3.14
fun main() {
    // write your code here
    //val (var1, var2, var3, var4) = readln().split("\n")
    //val op: String = var1.toString()
    //val a:Int? = var2.toInt()
    //val b:Int? = var3.toInt()
    //val c:Int? = var4.toInt()
    //val op = readln()
    calculateArea(readln())
    /*when (op) {
        "triangle" -> println(Math.sqrt(((a + b + c) / 2 * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c)).toDouble()))
        "rectangle" -> println(Math.multiplyFull(a, b))
        "circle" -> println(PI * c * 2)
        else -> println("Unknown input")
    }*/
}

fun calculateArea(op: String): Unit {
    when (op) {
        "triangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            val c = readln().toDouble()
            val s = ((a+b+c)/2)
            println(kotlin.math.sqrt((s*(s-a)*(s-b)*(s-c)).toDouble()).toDouble())
            //val s: Double = ((a+b+c)/2)
            //println(Math.sqrt(((a!! + b!! + c!!) / 2 * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c)).toDouble()))
        }
        "rectangle" -> {
            val a = readln().toInt()
            val b = readln().toInt()
            println((a * b).toDouble())
        }
        "circle" -> {
            val a = readln().toInt()
            println((PI * a * a).toDouble())
        }
        else -> println("Unknown input")
    }
}
