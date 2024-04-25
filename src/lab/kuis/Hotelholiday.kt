package lab.kuis
import java.util.Scanner

fun main() {2
    val scanner = Scanner(System.`in`)

    println("KUIS PRAKTIKUM 1")
    println("--------------------------------------\n")
    // Menentukan tarif kamar
    val standardRate = 250000
    val deluxeRate = 350000
    val superiorRate = 500000

    // Input kategori kamar
    println("Pilih kategori kamar:")
    println("1. Standart")
    println("2. Deluxe")
    println("3. Superior")
    print("Masukkan pilihan Anda: ")
    val choice = scanner.nextInt()

    // Validasi pilihan kategori kamar
    val ratePerNight = when (choice) {
        1 -> standardRate
        2 -> deluxeRate
        3 -> superiorRate
        else -> {
            println("Pilihan tidak valid, menghitung biaya dengan tarif standart")
            standardRate
        }
    }

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
