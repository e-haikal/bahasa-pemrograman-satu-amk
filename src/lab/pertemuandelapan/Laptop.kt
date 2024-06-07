package lab.pertemuandelapan

fun main() {
//    var data = arrayOf("ASUS", "LENOVO", "DELL", "Acer", "Mackbook",  "HP")
//    println("Data ke-8 : " + data[7])
    var data = arrayOf("ASUS", "LENOVO", "DELL", "Acer", "Mackbook", "HP")
    val judul: String = "Top 10 merk laptop di Indonesia"
    try {

        for (isi in data) {
                print(" " + isi)
        }
        println()
        println(judul)


    } catch (a: ArrayIndexOutOfBoundsException) {
        println("Maaf data tidak tersedia")
        println(judul)

    }
}