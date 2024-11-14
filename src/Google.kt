fun main() {
/*    println(birthdayGreeting("Rover", 5))
    println(birthdayGreeting("Rex", 2))*/
    calculation()
}

fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun calculation(){
    val firstN = 10
    val secondN = 5
    val thirdN = 8

    val adding = add(firstN, secondN)
    val result = substract(adding, thirdN)

    println("final result $result")
}

fun add(firstN : Int, secondN: Int) : Int {
    return firstN + secondN
}

fun substract(firstN: Int, secondN: Int) : Int {
    return firstN - secondN
}
