fun main(args: Array<String>) {
// program allows user to select an option
    var one = "Cheeseburger"
    var two = "Chicago Hot Dog"
    var three = "Nachos"
    var four = "Cheese Fries"
    var five = "Mozzarella Sticks"

    println(" -- Burger Shack -- ")
    println("1.\t$one")
    println("2.\t$two")
    println("3.\t$three")
    println("4.\t$four")
    println("5.\t$five\n")
    println("Choose 6 to leave.")

    var choice = 0
    var output = ""

    do {
        print("So, what would you like? ")
        choice = readLine()!!.toInt()

        output = when(choice) {
            1 -> "Here is your $one"
            2 -> "Here is your $two"
            3 -> "Here is your $three"
            4 -> "Here is your $four"
            5 -> "Here is your $five"
            !in 1..5 -> "That is not a menu choice..."
            else -> "No soup for you!"
        }
        // program outputs users choice
        println("$output. Have a nice day!")
    } while(choice != 6)
}
