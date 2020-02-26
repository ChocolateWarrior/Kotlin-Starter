package enums_when

class WhenExample {

    private fun getAuthorityRights(authority: Authorities): String {
        return when (authority.authorityName) {
            "admin" -> "Read, Write, Delete, Delete Users, Add Managers, Delete Managers"
            "manager" -> "Read, Write, Delete, Delete Users"
            "master" -> "Read, Write, Accept Order"
            "user" -> "Read, Write, Leave Order"
            "guest" -> "Read"
            else -> "No Authority given"
        }
    }

    fun runExample() {
        println("Type authority to find out rights: ")
        val authority: String? = readLine()
        try {
            println(getAuthorityRights(Authorities.valueOf(authority!!.toUpperCase())))
        } catch (e: RuntimeException){
            println(e.message)
        }
    }
}