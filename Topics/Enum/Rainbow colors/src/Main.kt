fun main() {
    // put your code here
    println(isRainbowColor(readln()))
}
enum class Rainbow {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun isRainbowColor(color: String): Boolean {
    for (colors in Rainbow.values()) {
        if (color.toUpperCase() == colors.name) return true
    }
    return false
}
