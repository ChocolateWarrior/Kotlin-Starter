class Person(private var name: String, private var age: Int) {

    val isAdult: Boolean
        get() = age >= 18

    fun getName() = name
    fun getAge() = age
}