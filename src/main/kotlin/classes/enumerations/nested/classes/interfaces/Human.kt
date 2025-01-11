package classes.enumerations.nested.classes.interfaces

class Human(val name: String, val height: Int, val gender: String) {
    override fun toString(): String {
        return "Имя: " + name + ", рост: " + height  +"см, пол: " + gender
    }

    class Head(val hairColor: String, val eyeColor: String, val girth: Int) {
        override fun toString(): String {
            return "Цвет волос: " + hairColor + ", цвет глаз: " + eyeColor  +", обхват головы: " + girth + "см"
        }
    }
    class Neck(val girth: Float) {
        override fun toString(): String {
            return "Обхват шеи: " + girth + "см"
        }
    }
    class Legs(val size: Int, val hip: Float, var shin: Float, val length: Float) {
        override fun toString(): String {
            return "Размер стопы: " + size + ", обхват бедра: " + hip  +"см, обхват голени: " + shin + "см, длина ноги: " + length +"см"
        }
    }
    class Hands(val size: Float, val shoulder: Float, val forearm: Float, val length: Int){
        override fun toString(): String {
            return "Размер руки (перчатки): " + size + ", обхват плеча: " + shoulder  +"см, обхват предплечья: " + forearm + "см, длина руки: " + length +"см"
        }
    }

    class Torso(val chers: Int, val waist: Int, val hips: Int){
        override fun toString(): String {
            return "Обхват груди: " + chers + "см, обхват талии: " + waist  +"см, обхват бёдер: " + hips + "см"
        }
    }
}