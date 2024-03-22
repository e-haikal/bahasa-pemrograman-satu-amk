package pertemuanempat

fun main() {
// Inisialisasi array dengan constructor
    val mahasiswa = Array(5) { "" } // Membuat array kosong dengan ukuran 5

    // Inisialisasi nilai elemen array
    mahasiswa[0] = "Stevi"
    mahasiswa[1] = "Dika"
    mahasiswa[2] = "Nesya"
    mahasiswa[3] = "Zidni"
    mahasiswa[4] = "Ceisya"

    // Menampilkan data mahasiswa ke-3
    println(mahasiswa[2])

    // Mengubah data mahasiswa ke-2 menjadi Handika
    mahasiswa[2] = "Handika"
    println(mahasiswa[2])

}