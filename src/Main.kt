import java.util.Scanner

fun main(){
    println("Enter the number of hours: ")
    val hours = Scanner(System.`in`).nextInt()
    val pay = when {
        hours in 1..2 -> hours * 20
        hours in 3..5 -> hours * 30
        hours > 5 -> hours * 40
        else -> 0
    }
    println("Total pay: $pay baht")
}

