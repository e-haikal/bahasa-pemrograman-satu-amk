package lab.pertemuansepuluh

import kotlin.math.pow

interface Persegi2Costum {
    val p: Double
    val l: Double

    fun hasil(): Double
}

class BalokCustom(override var p: Double, override var l: Double, private var t: Double) : Persegi2 {
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

class LimasCustom(override var p: Double, override var l: Double, private var t: Double) : Persegi2 {
    fun input() {
        println("Masukkan panjang limas: ")
        p = readLine()!!.toDouble()
        println("Masukkan lebar limas: ")
        l = readLine()!!.toDouble()
        println("Masukkan tinggi limas: ")
        t = readLine()!!.toDouble()
    }

    override fun hasil(): Double {
        return (1.0 / 3.0) * p * l * t
    }
}

fun main() {
    var b = BalokCustom(0.0, 0.0, 0.0)
    b.input()
    val volumeBalok = b.hasil()
    println("Volume balok adalah: $volumeBalok")

    var l = LimasCustom(0.0, 0.0, 0.0)
    l.input()
    val volumeLimas = l.hasil()
    println("Volume limas adalah: $volumeLimas")
}
