fun checkSpeed(speed: Int, limit: Int = 60) =
    if (speed <= limit) {
        println("Within the limit")
    } else {
        println("Exceeds the limit by ${speed - limit} kilometers per hour")
    }
