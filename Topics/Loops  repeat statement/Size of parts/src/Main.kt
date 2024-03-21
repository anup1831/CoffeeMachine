fun main() {
    // put your code here
    val n = readln().toInt()

    var larger=0; var perfect=0; var smaller=0
    repeat(n) {
        val size = readln().toInt()
        if (size > 0) {
            larger++
        } else if (size < 0){
            smaller++
        } else {
            perfect++
        }
    }
    print("$perfect $larger $smaller ")
}
