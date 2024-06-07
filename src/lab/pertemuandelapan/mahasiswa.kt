package lab.pertemuandelapan

class Mahasiswa {
    lateinit var nim: String
    lateinit var nama: String
    lateinit var prodi: String
}

fun main() {

    val data = Mahasiswa().apply {

        this.nim = "23.22.2510"
        nama = "Asman Haikal"
        prodi = "Sistem Informasi"
    }

    with(data) {
        println("NIM : $nim")
        println("NIM : $nama")
        println("NIM : $prodi")
    }

}