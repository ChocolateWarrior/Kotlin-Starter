fun main() {

    val argX = 3
    val argY = 5
    val sum = add(argX, argY)
    println("3 + 5 = $sum")
    println("3 + 5 = ${argX + argY}")

    val ivan = Person("Ivan", 20)
    val bob = Person("Bob", 12)
    println("Person: ${ivan.getName()}, age ${ivan.getAge()}, is an adult: ${ivan.isAdult}")
    println("Person: ${bob.getName()}, age ${bob.getAge()}, is an adult: ${bob.isAdult}")

    val userInput: String? = getNullableString()
    println("Type something...")
    println("Received $userInput with length ${userInput!!.length}" )

}

fun  add(argX: Int, argY: Int) = argX + argY

fun getNullableString(): String? {
    return readLine()
}



