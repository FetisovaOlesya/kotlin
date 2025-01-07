package `fun`.opp.abstractclasses

class Student(surname: String, name: String, age: Int) : Person(surname, name, age) {

    override fun work() {
        if (super.age >= 18) {
            println("Студент может работать")
        } else {
            println("Студент не достиг трудового возраста")
        }
    }
    override fun learn() {
        println("Студент учится")
    }
}