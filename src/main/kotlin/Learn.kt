fun main() {


    runSimulator("Guyal",::printConstructionCost) { playerName, numBuildings ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }

}

inline fun runSimulator(playerName: String, costPrinter: (Int) -> Unit, greetingFunction: (String, Int) -> String) {
    val numBuilding = (1..3).shuffled().last()
    costPrinter(numBuilding)
    println(greetingFunction(playerName, numBuilding))
}

fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("conscturtion cost: ${cost * numBuildings}")
}



