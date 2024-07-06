package lab.pertemuanduabelas

open class Manusia {
    open fun task() {
        println("Manusia melakukan tugas.")
    }

    open fun getReward() {
        println("Manusia mendapatkan hadiah.")
    }
}

// Derived class for Mahasiswa
class Mahasiswa(private var nim: String, private var nama: String, private var prodi: String) : Manusia() {

    override fun task() {
        println("$nama rajin kuliah.")
    }

    override fun getReward() {
        println("$nama mendapatkan hadiah. Yeay..")
    }

    fun getNim(): String {
        return nim
    }

    fun setNim(nim: String) {
        this.nim = nim
    }

    fun getNama(): String {
        return nama
    }

    fun setNama(nama: String) {
        this.nama = nama
    }

    fun getProdi(): String {
        return prodi
    }

    fun setProdi(prodi: String) {
        this.prodi = prodi
    }
}

// Derived class for Anak
class Anak(private var nama: String, private var alamat: String) : Manusia() {

    override fun task() {
        println("$nama rajin belajar")
    }

    override fun getReward() {
        println("$nama mendapatkan traktiran, yeay...")
    }

    fun getNama(): String {
        return nama
    }

    fun setNama(nama: String) {
        this.nama = nama
    }

    fun getAlamat(): String {
        return alamat
    }

    fun setAlamat(alamat: String) {
        this.alamat = alamat
    }
}

fun main() {
    // Membuat objek Mahasiswa
    val mahasiswa = Mahasiswa("23.22.2510", "Haikal", "SI")
    // Membuat objek Anak
    val anak = Anak("Asman Jr.", "Jl. Mancasan")

    // Polimorfisme dalam aksi
    val manusiaList: List<Manusia> = listOf(mahasiswa, anak)

    for (manusia in manusiaList) {
        manusia.task()
        manusia.getReward()
        println()
    }
}
