//All Kotlin programs need to have a main() function: fun main() {} 
fun main(){
    codeLab1()
    codeLab2()
}
 //CodeLab 1: "First Program" - just introducing the main function and println() calls.
fun codeLab1(){
    println("CODELAB1:")
    println("Happy Birthday!")
    println("Jhansi")
    println("You are 25!")
    //Vocabulary for Android Basics in Kotlin link: https://developer.android.com/courses/android-basics-kotlin/android-basics-kotlin-vocab
    //Practice on my own:
    print("Happy Birthday!\n")
    print("Jhansi\n")
    print("You are 25!\n")
}
//CodeLab 2
//Variables,repeat statement and funtion arguments
fun codeLab2(){
    println("")
    println("CODELAB2:")
   roverCake()
   println("\nChanging to Birthday Banner:\n")
   birthdayBanner()
   println("\nChanging to Layered Birthday Cake:\n")
   layeredCake()
}
fun roverCake(){
    //Important: A variable declared using the val keyword can only be set once. You cannot change its value later in the program.
    //You can declare a changeable variable with the var keyword, which you will do in a later codelab.
    val age = 5 * 365
    val name = "Rover"

    println("Happy Birthday, ${name}!")
     // Let's print a cake!
     println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")
    // This prints an empty line.
    println("")
    println("You are already ${age} days old, ${name}!")
    println("${age} is the very best age to celebrate!")
}
fun birthdayBanner(){
    val border = "`-._,-'"
    val timesToRepeat = 4
    printBorder(border, timesToRepeat)
    println("Happy Birthday, Jhansi!")
    printBorder(border, timesToRepeat)
}

fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}

fun layeredCake(){
    val age = 24
    val layers = 5
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}

fun printCakeTop(age: Int){
      repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCakeCandles(age: Int){
    print(" ")
    repeat(age) {
        print(",")
    }    
    println() // Print an empty line   
    print(" ") // Print the inset of the candles on the cake
    repeat(age) {
        print("|")
    }    
    println()
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }  
}
