package lab.pertemuansepuluh

interface Persegi2 {
    var p: Double
    var l: Double

    fun hasil(): Double
}

class Balok2 : Persegi2 {
    override var p = 0.0
    override var l = 0.0
    var t = 0.0

    fun input() {
        println("Masukkan panjang balok: ")
        p = readLine()!!.toDouble()
        println("Masukkan lebar balok: ")
        l = readLine()!!.toDouble()
        println("Masukkan tinggi balok: ")
        t = readLine()!!.toDouble()
    }

    override fun hasil(): Double {
        return p * l * t
    }
}

class Limas : Persegi2 {
    override var p = 0.0
    override var l = 0.0
    var t = 0.0

    fun input() {
        println("Masukkan panjang limas: ")
        p = readLine()!!.toDouble()
        println("Masukkan lebar limas: ")
        l = readLine()!!.toDouble()
        println("Masukkan tinggi limas: ")
        t = readLine()!!.toDouble()
    }

    override fun hasil(): Double {
        return (1.0/3.0) * p * l * t
    }
}

fun main() {
    var b = Balok2()
    b.input()
    val volumeBalok = b.hasil()
    println("Volume balok adalah: $volumeBalok")

    var l = Limas()
    l.input()
    val volumeLimas = l.hasil()
    println("Volume limas adalah: $volumeLimas")
}
