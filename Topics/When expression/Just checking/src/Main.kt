fun main() {
    // write your code here
    """Which programming language are you learning.  
        1. Java
        2. Kotlin
        3. Python
        4. Scala
    """.trimIndent().replace(Regex("(\n*)\n"), "$1")
    when (readln().toInt()) {
        1, 3, 4 -> println("No!")
        2 -> println("Yes!")
        else -> println("Unknown number")
    }
}
