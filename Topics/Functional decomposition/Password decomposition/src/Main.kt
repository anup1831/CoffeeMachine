fun validatePassword(password: String): Boolean {
    // write your code here
    val validationResult = password.length > 4
    if (!validationResult) {
        println("Your password should be five or longer characters, please write a new password")
        return false
    } else {
        println("Good password")
        return true
    }
}

// do not change the code below
fun main() {
    var validationResult = false
    while (!validationResult) {
        val password = readln()
        validationResult = validatePassword(password)
    }
}
