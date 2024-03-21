import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val title = input.nextLine()
    val author = input.nextLine()
    val pages = input.nextInt()

    // Student's code here
    val book = Book(title, author, pages)
    println(book.description())
}

class Book(var title: String, var author: String, var pages: Int = 0) {

    fun description(): String {
        return "$title by $author has $pages pages"
    }
}
