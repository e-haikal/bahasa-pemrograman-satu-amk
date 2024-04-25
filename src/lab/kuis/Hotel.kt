package lab.kuis

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("------------------------------------------")
    println("KUIS PRAKTIKUM 1")
    println("------------------------------------------")

    // Menentukan tarif kamar
    val roomRates = mapOf(
        "1. Standart" to 250000,
        "2. Deluxe" to 350000,
        "3. Superior" to 500000
    )

    // Input kategori kamar
    println("Pilih kategori kamar:")
    roomRates.forEach { (category, rate) ->
        println("$category - Rp$rate/malam")
    }
    print("\nMasukkan nomor kategori kamar: ")
    val choice = scanner.nextInt()

    // Validasi pilihan kategori kamar
    val selectedRate = roomRates.values.elementAtOrNull(choice - 1)
    val ratePerNight = selectedRate ?: 250000

    // Input jumlah kamar yang dipesan
    print("Masukkan jumlah kamar yang dipesan: ")
    val roomCount = scanner.nextInt()

    // Validasi jumlah kamar
    if (roomCount < 1) {
        println("Jumlah kamar harus lebih dari 0")
        return
    }

    // Input jumlah malam menginap
    print("Masukkan jumlah malam menginap: ")
    val nights = scanner.nextInt()

    // Validasi jumlah malam menginap
    if (nights < 1) {
        println("Jumlah malam menginap harus lebih dari 0")
        return
    }

    // Hitung biaya total
    val totalCost = ratePerNight * roomCount * nights

    // Output biaya yang perlu dibayarkan oleh pelanggan
    println("Biaya yang perlu dibayarkan oleh pelanggan untuk $roomCount kamar: Rp$totalCost")
}
