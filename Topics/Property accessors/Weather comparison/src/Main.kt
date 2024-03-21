class City(val name: String) {
    var degrees: Int = 0
        set(value) {
            field = if (value < -92 || value > 57) {
                if (name.uppercase() == "MOSCOW") 5 else if (name.uppercase() == "HANOI") 20 else 30

            } else {
                value
            }
        }
}        

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()

    val firstCity = City("Dubai")
    firstCity.degrees = first

    val secondCity = City("Moscow")
    secondCity.degrees = second

    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    if (firstCity.degrees == secondCity.degrees || 
        firstCity.degrees == thirdCity.degrees || 
        secondCity.degrees == thirdCity.degrees
    ) {
        print("neither")
    } else if (firstCity.degrees < secondCity.degrees && firstCity.degrees < thirdCity.degrees) {
        print(firstCity.name)
    } else if (thirdCity.degrees <= firstCity.degrees && thirdCity.degrees <= secondCity.degrees) {
        print(thirdCity.name)
    } else {
        println(secondCity.name)
    }

}
