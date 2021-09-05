/**
* Program that implements classes for different kinds of dwellings.
* Shows how to:
* Create class hierarchy, variables and functions with inheritance,
* abstract class, overriding, and private vs. public variables.
*/

import kotlin.math.PI
import kotlin.math.sqrt

fun main(){
   val squareCabin = SquareCabin(6,50.0)
   val roundHut = RoundHut(3,10.0)
   val roundTower = RoundTower(4,15.5)
   with(squareCabin){
        println("\nSquare Cabin\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
    }  
    with(roundHut) {
        println("\nRound Hut\n=========")
        println("Material: ${buildingMaterial}")
        println("Capacity: ${capacity}")
        println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Carpet size: ${calculateMaxCarpetSize()}")
    }   
    with(roundTower) {
        println("\nRound Tower\n==========")
        println("Material: ${buildingMaterial}")
        println("Capacity: ${capacity}")
        println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
        println("Carpet size: ${calculateMaxCarpetSize()}")
    }
}

/**
* Defines properties common to all dwellings.
* All dwellings have floorspace,
* but its calculation is specific to the subclass.
* Checking and getting a room are implemented here
* because they are the same for all Dwelling subclasses.
*
* @param residents Current number of residents
*/
abstract class Dwelling(private var residents: Int){
    abstract val buildingMaterial: String
    abstract val capacity: Int

     /**
    * Calculates the floor area of the dwelling.
    * Implemented by subclasses where shape is determined.
    *
    * @return floor area
    */
    abstract fun floorArea(): Double 

     /**
    * Checks whether there is room for another resident.
    *
    * @return true if room available, false otherwise
    */

    fun hasRoom(): Boolean {
        return residents < capacity
    }
    /**
    * Compares the capacity to the number of residents and
    * if capacity is larger than number of residents,
    * add resident by increasing the number of residents.
    * Print the result.
    */
    fun getRoom() {
        if(capacity > residents){
            residents++
            println("You got a room!")
        } else {
            println("Sorry, at capacity and no rooms are left.")
        }
    }    
}
/**
* A square cabin dwelling.
*
*  @param residents Current number of residents
*  @param length Length
*/
class SquareCabin(residents: Int, val length: Double) : Dwelling(residents){
    override val buildingMaterial = "Wood"
    override val capacity = 6

    override fun floorArea(): Double {
        return length * length
    }
}
/**
* Dwelling with a circular floorspace
*
* @param residents Current number of residents
* @param radius Radius
*/
open class RoundHut(val residents: Int, val radius: Double) : Dwelling(residents){
    override val buildingMaterial = "Straw"
    override val capacity  = 4

    override fun floorArea(): Double {
        return PI * radius * radius
    }
    fun calculateMaxCarpetSize(): Double {
        val diameter = 2 * radius
        return sqrt(diameter * diameter / 2)
    }
}
/**
* Round tower with multiple stories.
*
* @param residents Current number of residents
* @param radius Radius
* @param floors Number of stories
*/
class RoundTower(residents: Int, radius: Double, val floors: Int = 2) : RoundHut(residents, radius){
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors

    override fun floorArea(): Double {
        return super.floorArea() * floors
    }
}


