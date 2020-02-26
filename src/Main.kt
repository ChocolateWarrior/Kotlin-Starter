import enums_when.WhenExample
import interfaces.Boat
import interfaces.Car
import interfaces.Transport

fun main() {

    println("Type something...")
    val userInput: String? = getNullableString()
    println("Received $userInput with length ${userInput!!.length}" )

    //ENUM_WHEN
    val whenExample = WhenExample()
    whenExample.runExample()

    //INTERFACES
    val car: Transport = Car()
    val boat: Transport = Boat()

    car.move()
    boat.move()


}

fun add(argX: Int, argY: Int) = argX + argY

fun getNullableString(): String? {
    return readLine()
}



