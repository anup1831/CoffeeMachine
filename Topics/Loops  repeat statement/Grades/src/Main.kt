fun main() {
    // put your code here
    val n = readln().toInt()
    var countA = 0; var countB = 0; var countC = 0; var countD = 0
    repeat(n) {
        when (readln().toInt()) {
            2 -> countD++ 
            3 -> countC++ 
            4 -> countB++ 
            5 -> countA++        
        }
    }
    print("$countD $countC $countB $countA")
}
