package lab.pertemuanempat

fun main() {
    val angkaYangDisukai = setOf(1, 2, 3, 6, 8, 9, 11, 14, 15, 18, 21, 22)

    print("Masukkan angka tebakan: ")
    val nebak = readLine()!!.toInt()

    if (angkaYangDisukai.contains(nebak)) {
        println("BENAR")
    } else {
        println("SALAH")
    }
}
