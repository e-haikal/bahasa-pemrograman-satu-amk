package lab.pertemuandelapan

class Mobil {
    var merk = ""
    var tipe = ""
    var warna = ""
    var thnProduksi = 0

    fun penggerak() {
        println("Mobil memiliki penggerak depan, belakang, dan 4 roda")
    }

    fun transmisi() {
        println("Mobil memiliki transmisi manual dan otomatis")
    }

    fun tampil() {
        println("Merk mobil = $merk")
        println("Tipe mobil = $tipe")
        println("Warna mobil = $warna")
        println("Tahun produksi  mobil = $thnProduksi")
    }
}

fun main() {
    //create object
    val mobil = Mobil()
    //input -> inisialisasi
    mobil.merk = "Honda"
    mobil.tipe = "CRV"
    mobil.warna = "Hitam"
    mobil.thnProduksi = 2024

    //tamil data
    mobil.tampil()

    mobil.penggerak()
    mobil.transmisi()

    //tambah data mobil kedua
    //create object
    val mobildua = Mobil()
    //input -> inisialisasi
    mobildua.merk = "Toyota"
    mobildua.tipe = "Hilux"
    mobildua.warna = "Silver"
    mobildua.thnProduksi = 2023

    //tamil data mobil dua
    println("")
    mobildua.tampil()

    mobildua.penggerak()
    mobildua.transmisi()

}