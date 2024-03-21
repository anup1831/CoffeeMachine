fun main() {
    var positive = 0
    repeat(readln().toInt()) {
        if (readln().toInt() > 0) positive++
    }
    println(positive)
}
