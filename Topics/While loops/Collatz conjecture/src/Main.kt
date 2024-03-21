fun main() {
    var n = readln().toInt()
    val listOfNum = mutableListOf<Int>()
    listOfNum.add(n)
    while (n != 1) {
        if (n % 2 == 0) {
            n = n / 2
        } else {
            n = n * 3 + 1
        }
        listOfNum.add(n)
    }
    listOfNum.forEach { e -> print("$e ") }
}
