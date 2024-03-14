package pertemuandua

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Masukkan jarak rumah Pak Mamat dengan kampung halaman (N):")
    val N = scanner.nextDouble()

    val literBensin = N / 7
    val totalBiaya = literBensin * 13000

    println("Biaya yang harus disiapkan Pak Mamat untuk pulang kampung adalah: Rp $totalBiaya")
}
