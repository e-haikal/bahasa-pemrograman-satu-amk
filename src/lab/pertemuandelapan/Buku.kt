package lab.pertemuandelapan

class Buku {
    var judul = ""
    var penerbit = ""
    var harga = 0
    var diskon = 0.8

    fun pembayaran(jumlah: Int) {
        println("Judul buku = " + judul)
        println("Harga = " + harga)
        println("Jumlah + " + jumlah)
        println("Diskon = " + diskon)
        var total = harga * jumlah;
        println("Sub Total = " + judul)
        println("Diskon = " + (total*diskon/100))
        println("Bayar = " + (total - (total * diskon / 100)))
    }
}

fun main() {
    var jumlah = 5
    var buku = Buku()
    println("Judul buku = ")
    buku.judul = readLine().toString()
    println("Penerbit")
    buku.penerbit = readLine().toString()
    println("Harga")
    buku.harga = readLine().toString().toInt()
    println("Diskon")
    buku.diskon = readLine().toString().toDouble()
    println("Jumlah")
    jumlah = readLine().toString().toInt()
    buku.pembayaran(jumlah)

}