package `fun`.opp.abstractclasses

class Employee(surname: String, name: String, age: Int) : Person(surname, name, age) {

    override fun work() {
        println("Сотрудник работает")
    }
    override fun learn() {
        println("Сотрудник в данный период не проходит обучение")
    }
}