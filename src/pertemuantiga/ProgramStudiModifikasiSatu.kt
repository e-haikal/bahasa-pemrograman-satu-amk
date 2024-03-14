package pertemuantiga

fun main() {
    print("Masukkan NIM: ")
    val nim = readLine()?.trim() ?: ""

    // Memastikan input tidak kosong
    if (nim.isNotEmpty()) {
        val prodi = nim.subSequence(3, 5)

        when (prodi) {
            "12" -> print("S1 Sistem Informasi")
            "11" -> print("S1 Informatika")
            "62" -> print("Bachelor Degree Information System")
            "61" -> print("Bachelor Degree Information")
            "51" -> print("Magister Teknik Informatika")
            else -> print("Program Studi Tidak Ditemukan")
        }
    } else {
        println("NIM tidak boleh kosong.")
    }
}
