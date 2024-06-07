package lab.pertemuandelapan

import java.lang.NumberFormatException

fun main() {
    try {
        val pesan = "Kotlin ternyata menyenangkan"
        println(pesan.toInt())
    } catch (e: NumberFormatException) {
        println("Pesan harus berbentuk bilangan bulat")
    }

}