data class User(val name: String?, val email: String?)

fun printUserDetails(user: User) {
    if (user.name == null || user.email == null) {
        println("Incomplete User")
    } else {
        println("User Details:")
        println("Name: ${user.name}")
        println("Email: ${user.email}")
    }
}

fun main() {
    val user1 = User("Abc", "abc@gmail.com")
    val user2 = User(null, "mno@gmail.com")


    printUserDetails(user1) 
    printUserDetails(user2) 
   
}
