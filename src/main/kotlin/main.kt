import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    //create object of type Scanner
    val input:Scanner = Scanner(System.`in`)
//    print("Hello, What is your name? ")
//    val username = input.nextLine()
//    println()
//    //ask for age
//    print("Congrats $username: How old are you?")
//    val age = input.nextInt()
//    println()
//    print("That is a bit old. $age years really!!")

    //call listObject Function
    listObject()

    //using array properties
    val myMathGrades:Array<Int> = Array(20,{5})
    println("Third Grade: ${myMathGrades[4]}")
    println("Length: ${myMathGrades.size}")
}

//function to test properties in list class
fun listObject(){
    //creating a mutable list by invoking ArrayList
    //constructor
    var compModels:ArrayList<String> = ArrayList()
    //adding values to list
    compModels.add("HP")
    compModels.add("Dell")
    compModels.add("Apple")
    compModels.add("Lenovo")
    compModels.add("Compaq")

    //retrieve values from list
    println("Position 4 has: ${compModels.get(3)}")
    println("Pos 1 has: ${compModels[0]}")
    println("Number of Items: ${compModels.size}")
}
