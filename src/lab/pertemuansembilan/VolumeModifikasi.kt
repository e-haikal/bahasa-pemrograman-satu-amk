package lab.pertemuansembilan
// Hasilm
// Modifikasi program
// agar inputan panjang, lebar dan tingi menjadi inputan dinamis !
open class Persegi {
    var p = 0.0
    var l = 0.0

    open fun hasil(): Double {
        return p*l
    }
}

class Balok:Persegi() {
    var t = 0.0
    fun input(p: Double, lb: Double, t: Double) {
        this.p = p
        l = lb
        this.t = t
    }
    override fun hasil(): Double {
        return super.hasil()*t
    }
}

class Limas : Persegi() {
    var t = 0.0

    fun input(p: Double, l: Double, t: Double) {
        this.p = p
        this.l = l
        this.t = t
    }

    override fun hasil(): Double {
        return (1.0/3.0) * super.hasil() * t
    }
}

fun main() {
    var b = Balok()
    println("Masukkan panjang balok: ")
    val panjangBalok = readLine()!!.toDouble() //menerima input p. balok
    println("Masukkan lebar balok: ")
    val lebarBalok = readLine()!!.toDouble()
    println("Masukkan tinggi balok: ")
    val tinggiBalok = readLine()!!.toDouble()

    b.input(panjangBalok, lebarBalok, tinggiBalok)
    println("Volume balok = " + b.hasil())

    val c = Limas()
    println("Masukkan panjang limas: ")
    val panjangLimas = readLine()!!.toDouble() //menerima input p. balok
    println("Masukkan lebar limas: ")
    val lebarLimas = readLine()!!.toDouble()
    println("Masukkan tinggi limas: ")
    val tinggiLimas = readLine()!!.toDouble()

    c.input(panjangLimas, lebarLimas, tinggiLimas)
    println("Volume limas = " + c.hasil())
}