sealed class User (open val id : String){
}

data class EmailUser (override val id : String, val email : String, val password : String) : User(id)
data class Facebook (override val id : String, val password : String) : User (id)
data class Google (override val id : String, val email : String) : User(id)

fun log (user: User) {
    when(user) {
        is Google -> println("Google user id : ${user.id} \nGoogle Email: ${user.email}")
        is Facebook -> println("Facebook user: ${user.id} \nFacebook Password: ${user.password} ")
        is EmailUser -> println("EmailUser: ${user.id} \nEmailUser email: ${user.email} \nEmailUser Password: ${user.password} ")
    }
}
fun main(){
    val Google = Google("Marcus Marziano","marcus@mail.it")
    val Facebook = Facebook ("Marcus.Marziano9", "ciao1234")
    val EmailUser = EmailUser ("Marcus_Mail", "marcus@mail.it", "ciao1234")
    log(Google)
    log(Facebook)
    log(EmailUser)

}