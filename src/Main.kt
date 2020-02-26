import enums_when.WhenExample

fun main() {

    println("Type something...")
    val userInput: String? = getNullableString()
    println("Received $userInput with length ${userInput!!.length}" )

    val whenExample = WhenExample()
    whenExample.runExample()

}

fun add(argX: Int, argY: Int) = argX + argY

fun getNullableString(): String? {
    return readLine()
}



