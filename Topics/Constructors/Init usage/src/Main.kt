/*
fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}

class ByteTimer(var time: Int) {
    init {
        if (time < -128) {
            time = -128
        } else if (time > 127) {
            time = 127
        } else {
            time = time
        }
    }
}*/

class Counter(var value: Int) {

    fun increment() {
        ++value
    }
}

fun main() {
    val counter = Counter(1)
    //Counter().increment()
    Counter(1).increment()
}
