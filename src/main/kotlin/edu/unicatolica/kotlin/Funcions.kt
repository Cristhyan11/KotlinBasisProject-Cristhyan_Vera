package edu.unicatolica.kotlin

import kotlin.math.pow
import kotlin.random.Random
import kotlin.math.max
fun section (title: String){
    println("\n"+ "=".repeat(75))
    println(title)
    println("=".repeat(75))
}

fun varialablesAndTypes(){


    val lang: String = "kotlin"
    var counter = 0


    println("val lang = $lang")
    println("val counter = $counter")

    counter += 3

    println("counter after += 3 => $counter")
}
fun conditionalsAsExpression(n: Int){
    section("(2) conditional as Expression & when")

    val parity =if (n % 2 == 0) "even" else "add"

    println("n=$n is $parity")

    val description = when {
        n == 0 -> "zero"
        n in 1..9-> "one digit positive"
        n < 0 -> "negative"
        else -> "Positive (>=10)"
    }

    println("Description: $description")

}

fun LoopsDemo(){
    section("3) Loops: for /while / do-while")

    //Allways use when you know the range of the elements

    println("for 1 to 5: ")
    for (i in 1..5) println("$i ")
    println()

    val list = listOf("a","b","c")
    println("for over list: ")
    for(x in list) println("$x ")
    println()

    //use when you don't know the range of elements
    //but you know a stop condition

    var x =3
    println("while x>0 ")
    while (x>0) {
        println("$x")
        x--
    }
    println()

    //runs at least once
    var y = 0
    println("do-while y<1: ")
    do {
        println("$y ")
        y++
    }while (y < 1)
    println()



}



fun main(){
    varialablesAndTypes()
    conditionalsAsExpression(6)
    LoopsDemo()


}