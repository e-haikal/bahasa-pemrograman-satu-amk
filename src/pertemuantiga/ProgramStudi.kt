package pertemuantiga

fun main() {
    var nim = "23.22.2510"
    var prodi = nim.subSequence(3,5)
    when (prodi) {
        "12" -> print("S1 Sistem Informasi")
        "22" -> print("S1 Sistem Informasi Transfer")
        "11" -> print("S1 Informatika")
        "62" -> print("Bachelor Degre Information System")
        "61" -> print("Bachelor Degre Information")
        "51" -> print("Magister Teknik Informatika")
        else -> print("Program Studi Tidak Ditemukan")

    }
}