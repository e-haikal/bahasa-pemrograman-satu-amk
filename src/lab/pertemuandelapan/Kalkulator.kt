package lab.pertemuandelapan

fun main() {
//    var a = 10
//    var b = 0
//    //kalkulator sederhana
//    var tambah = a + b
//    var kurang = a - b
//    var kali = a * b
//    var bagi = a / b
//    //hasil
//    println("$a * $b = ${tambah.toDouble()}")
//    println("$a - $b = $kurang")
//    println("$a * $b = $kali")
//    println("$a / $b  = ${bagi.toDouble()}")
//


    var a = 10
    var b = 0

    // kalkulator sederhana
    var tambah = a + b
    var kurang = a - b
    var kali = a * b
    var bagi: Double? = null // Menggunakan tipe data nullable untuk menandai pembagian yang tidak valid

    // hasil
    println("$a + $b = $tambah")
    println("$a - $b = $kurang")
    println("$a * $b = $kali")

    try {
        bagi = a.toDouble() / b.toDouble()
        println("$a / $b = $bagi")
    } catch (e: ArithmeticException) {
        println("Maaf, pembagian dengan angka 0 tidak bisa dilakukan")
    }
}

