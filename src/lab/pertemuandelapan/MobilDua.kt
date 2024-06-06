package lab.pertemuandelapan

class MobilDua(var merk: String, var tipe: String, var warna: String, var thnProduksi: Int) {
    fun penggerak() {
        println("Mobil memiliki penggerak depan, belakang, dan 4 roda")
    }

    fun transmisi() {
        println("Mobil memiliki transmisi manual dan otomatis")
    }

    fun dataMobil() {
        println("Merk mobil = $merk")
        println("Tipe mobil = $tipe")
        println("Warna mobil = $warna")
        println("Tahun produksi  mobil = $thnProduksi")
    }
}

fun main() {
    //create object
    val mobilkedua = MobilDua("Mitsubitshi", "L300", "Hitam", 2023)

    //tamil data
    mobilkedua.dataMobil()

    mobilkedua.penggerak()
    mobilkedua.transmisi()
}