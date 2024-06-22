package lab.pertemuansembilan

open class Person {
    var name = ""
    var gender = ""
    var address = ""

    fun  talk() {
        println("Manusia dapat berbicara")
    }
    fun  walk() {
        println("Manusia dapat berjalan")
    }
    fun  eat() {
        println("Manusia butuh makan")
    }

    open fun data() {
        println("Name : $name")
        println("Gender : $gender")
        println("Address : $address")
    }
}

class MathTeacher: Person() {
    var schoolName = ""
    fun teachMath() {
        println("Hari ini saya mengajar matematika")
    }
    override fun data() {
        super.data()
        println("School Name : $schoolName")
    }
}

class Footballer: Person() {
    var club = ""
    fun playFootball() {
        println("Hari ini saya bermain sepak bola")

    }

    override fun data() {
        super.data()
        println("Club : $club")
    }
}

class Businessman: Person() {
    var company = ""
    fun doBusiness() {
        println("Hari ini saya melakukan bisnis")
    }

    override fun data() {
        println("Company : $company")
    }
}

fun main() {
    val haikal = MathTeacher()
    haikal.talk()
    haikal.walk()
    haikal.eat()
    haikal.teachMath()

    haikal.name = "Asman Haikal"
    haikal.gender = "Female"
    haikal.address = "Depok, DIY"
    haikal.schoolName = "Amikom"
    haikal.data()


    val footballer = Footballer()
    footballer.talk()
    footballer.walk()
    footballer.eat()
    footballer.playFootball()

    val business = Businessman()
    business.talk()
    business.walk()
    business.eat()
    business.doBusiness()
}