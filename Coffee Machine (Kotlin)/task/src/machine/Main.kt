package machine


var DEFAULT_WATER = 400
var DEFAULT_MILK = 540
var DEFAULT_BEANS = 120
var DEFAULT_CUPS = 9
var DEFAULT_AMOUNT = 550

fun main() {
    val coffeeMachine = CoffeeMachine(DEFAULT_WATER, DEFAULT_MILK, DEFAULT_BEANS, DEFAULT_CUPS, DEFAULT_AMOUNT)

    showMainMenu(coffeeMachine)
}

fun showMainMenu(coffeeMachine: CoffeeMachine) {
    print("\nWrite action (buy, fill, take, remaining, exit):\n>")
    val action = readln()
    processMainMenuResponse(action, coffeeMachine)
}

fun processMainMenuResponse(action: String, coffeeMachine: CoffeeMachine) {

    when (action) {
        "buy" -> coffeeMachine.chooseCoffeeOptions(action, coffeeMachine)
        "fill" -> coffeeMachine.updateCoffeeMachine(coffeeMachine)
        "take" -> coffeeMachine.updateTotalAmount(coffeeMachine)
        "remaining" -> {
            coffeeMachine.displayMainMenu(coffeeMachine)
        }
        "exit" -> { System.exit(0)}
        else -> {
            println("Wrong Input")
        }
    }
}
