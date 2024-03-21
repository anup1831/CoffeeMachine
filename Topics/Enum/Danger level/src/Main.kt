/*interface iGetLevel{
    fun getLevel(): Int
}*/
/*
enum class DangerLevel(val lv: Int) {
    HIGH (3),
    MEDIUM (2),
    LOW (1);

    fun getLevel() = this.lv

}
fun main(){
    val high = DangerLevel.HIGH
    val medium = DangerLevel.MEDIUM

    println(high.getLevel() > medium.getLevel()) // true 
}*/
enum class DangerLevel(val lv: Int) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    fun getLevel() = this.lv

}
fun main() {
    val high = DangerLevel.HIGH
    val medium = DangerLevel.MEDIUM

    println(high.getLevel() > medium.getLevel()) // true
}