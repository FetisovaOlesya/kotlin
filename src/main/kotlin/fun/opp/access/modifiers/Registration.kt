package `fun`.opp.access.modifiers

import java.util.*

class Registration() {
    private var email = ""

    private var password = ""

    fun setEmail(email: String) {
        this.email = email
    }

    public fun getEmail(): String = email.uppercase()

    fun setPassword(password: String) {
        if (password.length < 6) {
            println("Пароль должен быть не менее 6-ти символов")
        } else {
            println("Пароль установлен")
        }
        this.password = password
    }

    fun displayInto () {
        println("Email пользователя: " +
                getEmail() +
                " | пароль пользователя: " +
                getPassword()
        )
    }

    private fun getPassword(): String = password


}