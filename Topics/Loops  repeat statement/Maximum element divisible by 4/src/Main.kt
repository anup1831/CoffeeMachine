fun main() {
    val n = readln().toInt()
    var max = 0
    val list = mutableListOf<Int>()
    if (n <= 1000) {
        repeat(n) {
            val num = readln().toInt()
            list.add(num)
        }
        max = list.filter { it <= 30000 && it % 4 == 0 }.maxOrNull()!!
        println(max)
    }
}
