package lab.pertemuanempat

fun main() {
    var matkul: MutableList<String> = mutableListOf(
        "Bahasa Pemrograman 1",
        "Sistem Informasi Manajemen",
        "Pemrograman Terstruktur",
        "Akuntansi"
    )


    //tambah data matakuliah
    matkul.add("Pemrograman Web")

    //ubah data matkul
    matkul[4] = "Perancangan Pemrograman Web"

    //hapus data mahasiswa
    matkul.removeAt(4)

    //tambah data matakuliah matematika diskrit
    matkul.add("Matematika Diskrit")

    //ubah data matkul
    matkul[4] = "Matematika Bisnis"

    //hapus data mahasiswa Matematika Bisnis
    matkul.removeAt(4)

    print("Matakuliah : $matkul")

}