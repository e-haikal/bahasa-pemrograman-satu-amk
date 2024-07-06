package lab.pertemuantigabelas

// Kelas Manusia3
open class Manusia3 {
    open fun task() {
        println("fungsi task() milik class Manusia")
    }

    open fun getReward() {
        println("fungsi getReward() milik class Manusia")
    }
}

// Kelas Karyawan2
class Karyawan2 : Manusia3() {
    private var idKaryawan: String = ""
    private var namaKry: String = ""
    private var jabatan: String = ""
    private var statusNikah: String = ""
    private var jmlAnak: Int = 0

    fun setIdKaryawan(id: String) {
        idKaryawan = id
    }

    fun getIdKaryawan(): String {
        return idKaryawan
    }

    fun setNamaKry(nama: String) {
        namaKry = nama
    }

    fun getNamaKry(): String {
        return namaKry
    }

    fun setJabatan(jab: String) {
        jabatan = jab
    }

    fun getJabatan(): String {
        return jabatan
    }

    fun setStatusNikah(status: String) {
        statusNikah = status
    }

    fun getStatusNikah(): String {
        return statusNikah
    }

    fun setJmlAnak(jml: Int) {
        jmlAnak = jml
    }

    fun getJmlAnak(): Int {
        return jmlAnak
    }

    override fun task() {
        if (jabatan == "Manajer") {
            println(
                "melakukan pengecekan stok barang dan tanggal kadaluarsa produk, " +
                        "\nmenentukan posisi display tiap produk, " +
                        "\nmengecek laporan penjualan oleh kasir, " +
                        "\nmenganalisa laporan penjualan untuk membuat kebijakan seperti " +
                        "\ndiberikan promo/diskon untuk barang yang jarang terjual namun " +
                        "\nmendekati tanggal kadaluarsa, menentukan shift karyawan, dan lainnya"
            )
        } else if (jabatan == "Penjaga") {
            println(
                "memastikan bahwa produk terdisplay dengan baik, " +
                        "\nmelayani pelanggan apabila butuh bantuan, " +
                        "\nmengecek stok barang yang didisplay, " +
                        "\nmenjaga kebersihan dan kerapian toko."
            )
        } else if (jabatan == "Kasir") {
            println(
                "memastikan nominal uang yang diterima sesuai dengan transaksi penjualan, " +
                        "\nmembuat laporan penjualan di akhir shift, " +
                        "\njika nominal uang tidak sesuai, maka bersedia untuk mengganti, " +
                        "\nmenjaga kerapian dan kebersihan toko."
            )
        } else {
            println("Jabatan tidak tersedia")
        }
    }

    override fun getReward() {
        var tunjKeluarga = 0
        var gajiPokok = 0
        var tunjAnak = 0

        if (jabatan == "Manajer") {
            gajiPokok = 3500000
            if (statusNikah == "Menikah") {
                tunjKeluarga = 250000
            }
            if (jmlAnak > 0 && jmlAnak <= 3) {
                tunjAnak = jmlAnak * 150000
            } else if (jmlAnak > 3) {
                tunjAnak = 3 * 150000
            }
        } else if (jabatan == "Penjaga") {
            gajiPokok = 2000000
            if (statusNikah == "Menikah") {
                tunjKeluarga = 150000
            }
            if (jmlAnak > 0 && jmlAnak <= 2) {
                tunjAnak = jmlAnak * 100000
            } else if (jmlAnak > 2) {
                tunjAnak = 2 * 100000
            }
        } else if (jabatan == "Kasir") {
            gajiPokok = 2500000
            if (statusNikah == "Menikah") {
                tunjKeluarga = 200000
            }
            if (jmlAnak > 0 && jmlAnak <= 2) {
                tunjAnak = jmlAnak * 150000
            } else if (jmlAnak > 2) {
                tunjAnak = 2 * 150000
            }
        } else {
            println("Jabatan tidak tersedia")
        }

        println(
            "Gaji Pokok Rp $gajiPokok " +
                    "\nTunjangan Keluarga Rp $tunjKeluarga " +
                    "\nTunjangan Anak Rp $tunjAnak " +
                    "\nTotal Gaji Rp " + (gajiPokok + tunjKeluarga + tunjAnak)
        )
    }
}

// Kelas Nasabah
class Nasabah : Manusia3() {
    private var saldo: Double = 0.0
    private var hi1000: Double = 0.0
    private var nisbah: Double = 0.0
    private var pinAtm: String = ""
    private var pinMobileBanking: String = ""

    fun setSaldo(saldo: Double) {
        this.saldo = saldo
    }

    fun getSaldo(): Double {
        return saldo
    }

    fun setHi1000(hi1000: Double) {
        this.hi1000 = hi1000
    }

    fun getHi1000(): Double {
        return hi1000
    }

    fun setNisbah(nisbah: Double) {
        this.nisbah = nisbah
    }

    fun getNisbah(): Double {
        return nisbah
    }

    fun setPinAtm(pin: String) {
        pinAtm = pin
    }

    fun getPinAtm(): String {
        return pinAtm
    }

    fun setPinMobileBanking(pin: String) {
        pinMobileBanking = pin
    }

    fun getPinMobileBanking(): String {
        return pinMobileBanking
    }

    override fun task() {
        println("Menjaga kerahasiaan data perbankan dan menaati aturan bank.")
    }

    override fun getReward() {
        val bagiHasil = (saldo / 1000) * hi1000 * (nisbah / 100)
        println("Bagi Hasil = Rp $saldo / 1000 * $hi1000 * $nisbah / 100 = Rp $bagiHasil,-")
    }
}

// Kelas Main
fun main() {
    val nasabah = Nasabah()

    // Input dari pengguna
    println("Masukkan Saldo Nasabah:")
    nasabah.setSaldo(readLine()?.toDoubleOrNull() ?: 0.0)
    println("Masukkan HI-1000:")
    nasabah.setHi1000(readLine()?.toDoubleOrNull() ?: 0.0)
    println("Masukkan Nisbah Nasabah (%):")
    nasabah.setNisbah(readLine()?.toDoubleOrNull() ?: 0.0)
    println("Masukkan PIN ATM:")
    nasabah.setPinAtm(readLine() ?: "")
    println("Masukkan PIN Mobile Banking:")
    nasabah.setPinMobileBanking(readLine() ?: "")

    nasabah.task()
    nasabah.getReward()
}
