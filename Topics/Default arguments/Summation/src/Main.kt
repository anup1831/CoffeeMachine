fun sum5(vararg nums: Int): Int {
    var result = 0
    for (n in nums) {
        result += n
    }
    return result
}
