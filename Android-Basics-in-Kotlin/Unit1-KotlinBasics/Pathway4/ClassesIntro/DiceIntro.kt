fun main(){
    val myFirstDice = Dice(6,"Red")
    val mySecondDice = Dice(20,"Blue")
    val myCoin = Coin()
    println("Coin flip ... ${myCoin.flip()}!")
    println("Your ${myFirstDice.color} ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}!")
    println("Your ${mySecondDice.color} ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")
}

class Dice (val numSides: Int, val color: String) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}

class Coin () {
    fun flip(): String {
        if((1..2).random() == 1){
            return "Heads"
        }else{
            return "Tails"
        }
    }
}
