fun main() {
    println("In main")
    val argX = 3
    val argY = 5
    val sum = add(argX, argY)
    println("3 + 5 = $sum")
    println("3 + 5 = ${argX + argY}")

    val userInput: String? = getNullableString()
    println("Received $userInput with length ${userInput!!.length}" )
}

fun  add(argX: Int, argY: Int) = argX + argY

fun getNullableString(): String? {
    return readLine()
}



