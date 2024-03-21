fun main() {
    // put your code here

    val (country1, country2)  = readln().split(" ")

    val currency1 = findCurrencyUsed(country1)
    val currency2 = findCurrencyUsed(country2)
    println(if (currency1 == currency2) true else false)
}

fun findCurrencyUsed(country1: String): String {
    var currency: String? = ""
    for (enum in Country.values()) {
        if (country1.uppercase().equals(enum.name)) {
            currency = enum.currency
        }
    }
    return currency.toString();
}

enum class Country(val country: String, val currency: String) {
    GERMANY("Germany", "Euro"),
    MALI("Mali", "CFA franc"),
    DOMINICA("Dominica", "Eastern Caribbean dollar"),
    CANADA("Canada", "Canadian dollar"),
    SPAIN("Spain", "Euro"),
    AUSTRALIA("Australia", "Australian dollar"),
    BRAZIL("Brazil", "Brazilian real"),
    SENEGAL("Senegal", "CFA franc"),
    FRANCE("France", "Euro"),
    GRENADA("Grenada", "Eastern Caribbean dollar"),
    KIRIBATI("Kiribati", "Australian dollar");
}