package machine


const val COFFEE_ESPRESSO = "espresso"
const val ESPRESSO_RATE_PER_CUP = 4
const val ESPRESSO_WATER_REQ = 250
const val ESPRESSO_MILK_REQ = 0
const val ESPRESSO_BEANS_REQ = 16

const val COFFEE_LATTE = "latte"
const val LATTE_RATE_PER_CUP = 7
const val LATTE_WATER_REQ = 350
const val LATTE_MILK_REQ = 75
const val LATTE_BEANS_REQ = 20

const val COFFEE_CAPPUCCINO = "cappuccino"
const val CAPPUCCINO_RATE_PER_CUP = 6
const val CAPPUCCINO_WATER_REQ = 200
const val CAPPUCCINO_MILK_REQ = 100
const val CAPPUCCINO_BEANS_REQ =12

class CoffeeMachine(private var water: Int = 400, private var milk: Int = 540, private var coffeeBeans: Int = 120, private var cups: Int = 9, private var amount: Int = 550) {

    fun chooseCoffeeOptions(action: String, coffeeMachine: CoffeeMachine) {
        println("What do you want to buy? 1 - $COFFEE_ESPRESSO, 2 - $COFFEE_LATTE, 3 - $COFFEE_CAPPUCCINO, back - to main menu: \n>")
        makeCoffee(readln(), action, coffeeMachine)
    }

    fun makeCoffee(option: String, action: String, coffeeMachine: CoffeeMachine) {
        //make and calculate coffee resources aand update the system

        when (option) {
            "1" -> {
                updateMainMenu(
                    coffeeMachine,
                    action,
                    option.toInt()
                )
            }

            "2" -> {
                updateMainMenu(
                    coffeeMachine,
                    action,
                    option.toInt()
                )
            }

            "3" -> {
                updateMainMenu(
                    coffeeMachine,
                    action,
                    option.toInt()
                )
            }

            "back" -> {
                showMainMenu(coffeeMachine)
            }

            else -> {
                "Wrong choice"
                //coffeeMachineMainMenu() }
            }
        }

    }

    fun updateCoffeeMachine(coffeeMachine: CoffeeMachine) {
        println("Write how many ml of water the coffee machine has:")
        val waterlv = readln().toInt()

        println("Write how many ml of milk the coffee machine has:>")
        val milklv = readln().toInt()

        println("Write how many grams of coffee beans the coffee machine has:>")
        val beans = readln().toInt()

        println("How many dispossal cups You want to add:>")
        val availableCups = readln().toInt()
        coffeeMachine.water += waterlv; coffeeMachine.milk += milklv
        coffeeMachine.coffeeBeans += beans; coffeeMachine.cups += availableCups
        coffeeMachine.amount += 0
        showMainMenu(coffeeMachine)
    }

    fun updateTotalAmount(coffeeMachine: CoffeeMachine) {
        println("I gave you $${coffeeMachine.amount}\n")
        coffeeMachine.amount = 0
        showMainMenu(coffeeMachine)
    }

    fun calculateNumOfCoffeeCanBeMake(coffeeMachine: CoffeeMachine, option: Int): Int {
        var minCoffee = 0
        if (coffeeMachine.water > 0 && coffeeMachine.milk > 0 && coffeeMachine.coffeeBeans > 0) {
            when (option) {
                1 -> {
                    minCoffee = minOf(
                        (coffeeMachine.water / ESPRESSO_WATER_REQ),/* (milklv / ESPRESSO_MILK_REQ),*/
                        (coffeeMachine.coffeeBeans / ESPRESSO_BEANS_REQ)
                    )
                }

                2 -> {
                    minCoffee =
                        minOf((coffeeMachine.water / LATTE_WATER_REQ), (coffeeMachine.milk / LATTE_MILK_REQ), (coffeeMachine.coffeeBeans / LATTE_BEANS_REQ))
                }

                3 -> {
                    minCoffee = minOf(
                        (coffeeMachine.water / CAPPUCCINO_WATER_REQ),
                        (coffeeMachine.milk / CAPPUCCINO_MILK_REQ),
                        (coffeeMachine.coffeeBeans / CAPPUCCINO_BEANS_REQ)
                    )
                }
            }

        }
        return minCoffee
    }

    fun updateMainMenu(coffeeMachine: CoffeeMachine,
        action: String,
        option: Int

    ) {
        if (action.equals("buy")) {
            val maxCoffees = calculateNumOfCoffeeCanBeMake(
                coffeeMachine, option
            )
            if (maxCoffees > 0) {
                println("I have enough resources, making you a coffee!")
                when (option) {
                    1 -> {
                        calculateResourceLevel(
                            ESPRESSO_WATER_REQ,
                            ESPRESSO_MILK_REQ,
                            ESPRESSO_BEANS_REQ,
                            1,
                            ESPRESSO_RATE_PER_CUP,
                            option,
                            coffeeMachine
                        )
                    }

                    2 -> {
                        calculateResourceLevel(
                            LATTE_WATER_REQ,
                            LATTE_MILK_REQ,
                            LATTE_BEANS_REQ,
                            1,
                            LATTE_RATE_PER_CUP,
                            option,
                            coffeeMachine
                        )
                    }

                    3 -> {
                        calculateResourceLevel(
                            CAPPUCCINO_WATER_REQ,
                            CAPPUCCINO_MILK_REQ,
                            CAPPUCCINO_BEANS_REQ,
                            1,
                            CAPPUCCINO_RATE_PER_CUP,
                            option,
                            coffeeMachine
                        )
                    }
                }
            } else {
                println("Sorry, not enough water!")
                //coffeeMachineMainMenu()
                showMainMenu(coffeeMachine)
            }

        } else if (action.equals("fill")) {
            updateCoffeeMachine(coffeeMachine)
        } else {
            updateTotalAmount(coffeeMachine)
        }

    }

    fun calculateResourceLevel(
        waterlv: Int,
        milklv: Int,
        beanlv: Int,
        numOfCoffee: Int,
        amountt: Int,
        option: Int,
        coffeeMachine: CoffeeMachine
    ) {
        coffeeMachine.water = coffeeMachine.water - waterlv; coffeeMachine.milk = milk - milklv
        coffeeMachine.coffeeBeans = coffeeMachine.coffeeBeans - beanlv; coffeeMachine.cups = coffeeMachine.cups - numOfCoffee
        coffeeMachine.amount = coffeeMachine.amount + amountt
        showMainMenu(coffeeMachine)
    }

    fun displayMainMenu(coffeeMachine: CoffeeMachine) {
        println(
            "The coffee machine has:\n" +
                    "${coffeeMachine.water} -  ml of water\n" +
                    "${coffeeMachine.milk} ml of milk \n" +
                    "${coffeeMachine.coffeeBeans} g of coffee beans \n" +
                    "${coffeeMachine.cups} disposable cups \n" +
                    "$${coffeeMachine.amount} of money"
        )
        showMainMenu(coffeeMachine)
    }
}
