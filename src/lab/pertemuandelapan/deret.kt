package lab.pertemuandelapan

fun main() {
    var angka: Int? = 5

    angka?.let {
        for (a in 2..angka step 2) { // Mulai dari 2, plus 2 setiap iterasi
            print(" $a")
        }
    }
}
