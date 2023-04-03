enum class Stack { FRONTEND, BACKEND, FULLSTACK }
enum class Level { BEGINNER, INTERMEDIARY, ADVANCED}
data class Course(val name : String, val level : Level, val stack : Stack)
data class User(val userName: String, val email: String)
data class Bootcamp(val name:String, var courses : List<Course>){
    val subscribed = mutableListOf<User>()

    fun enrollUser(user : User) = subscribed.add(user)
    fun enrollUsers(users : Collection<User>) = subscribed.addAll(users);
}

fun main(){
    val user1 = User("leandrosouzants", "leandroszsnts@teste.com")
    val user2 = User("carlosantonio", "carlosantonio@teste.com")

    val users = listOf(
            User("rafaela04", "rafaelamartins@teste.com"),
            User("josue333", "josue@teste.com"),
            User("antonio", "antonio@teste.com")
    )


    val couses = listOf(Course("Fundamental Kotlin", Level.BEGINNER, Stack.BACKEND))
    val bootcamp = Bootcamp("Kotlin Developper", couses)

    //matricula
    bootcamp.enrollUser(user1)
    bootcamp.enrollUser(user2)
    bootcamp.enrollUsers(users)

    println("Subscribed Users ${bootcamp.name}: ")
    println(bootcamp.subscribed.map { u -> "UserName: ${u.userName}, Email: ${u.email} "})

}