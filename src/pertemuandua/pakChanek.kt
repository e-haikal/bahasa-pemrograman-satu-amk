package pertemuandua

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Masukkan jumlah kandang bebek (X):")
    val X = scanner.nextInt()

    println("Masukkan jumlah bebek dalam setiap kandang (Y):")
    val Y = scanner.nextInt()

    val totalBebek = X * Y

    println("Total bebek yang dapat dipelihara oleh Pak Chanek adalah: $totalBebek")
}
