package lab.pertemuanlima

fun totalLaba(laba: Set<Int>): Int {
    return laba.sum()
}
fun main() {
    var laba: MutableSet<Int> = mutableSetOf()
    var penjualan: Int
    var pengeluaran: Int
    var jawab: String

    do {
        print("Total penjualan hari ini = ")
        penjualan = readLine().toString().toInt()
        print("Tontal pengeluaran hari ini = ")
        pengeluaran = readLine().toString().toInt()
        laba.add(penjualan - pengeluaran)
        print("Apakah ada data yang ingin ditambahkan? [Y / T]")
        jawab = readLine().toString()
    } while (jawab == "Y")

    //laba diatas 1 juta
    println("Laba di atas Rp1.000.000 = " + laba.filter { it > 1_000_000 })

    //totalLaba
    println("Total laba = ${totalLaba(laba)}")

    if (totalLaba(laba) > 50000000) {
        println("Toko Anda untung besar")
    } else {
        println("Toko Anda kurang hoki kali ini.")
    }

}