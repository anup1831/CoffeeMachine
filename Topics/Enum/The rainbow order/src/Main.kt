fun main() {
    // put your code here
    println(getPosition(readln()))
}

enum class Rainbow {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun getPosition(color: String): Int {
    for (enum in Rainbow.values()) {
        if (color.toUpperCase() == enum.name) return enum.ordinal + 1
    }
    return 0
}
