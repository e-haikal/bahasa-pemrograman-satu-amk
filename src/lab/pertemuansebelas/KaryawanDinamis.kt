package lab.pertemuansebelas

import java.util.Scanner

class KaryawanDinamis {
    private var nik = ""
    private var nama = ""
    private var gaji = 0
    private var departemen = ""

    fun input() {
        val scanner = Scanner(System.`in`)
        print("Masukkan NIK: ")
        nik = scanner.nextLine()
        print("Masukkan Nama: ")
        nama = scanner.nextLine()
        print("Masukkan Gaji: ")
        gaji = scanner.nextInt()
        scanner.nextLine() // untuk membersihkan new line setelah nextInt()
        print("Masukkan Departemen: ")
        departemen = scanner.nextLine()
    }

    fun data() {
        println("-----------Data Karyawan--------------")
        println("NIK \t\t: $nik")
        println("Nama \t\t: $nama")
        println("Gaji \t\t: $gaji")
        println("Departemen \t: $departemen")
    }
}

fun main() {
    var kry = KaryawanDinamis()
    kry.input()
    kry.data()
}