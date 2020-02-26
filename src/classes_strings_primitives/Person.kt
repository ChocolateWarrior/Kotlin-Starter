package classes_strings_primitives

class Person(var firstName: String, var age: Int) {

    val isAdult: Boolean
        get() = age >= 18

}