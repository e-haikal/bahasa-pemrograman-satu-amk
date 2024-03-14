package pertemuandua

fun main() {

//    //first try without reference - using if else
//    var hargaMakanan: Int? = null
//    hargaMakanan = readLine()?.toInt()
//
//    if (hargaMakanan in 7501..10000){
//        println("Mahal")
//    } else if (hargaMakanan in 4000 .. 7500){
//        println("Sedang")
//    } else if (hargaMakanan in 500 .. 3999){
//        println("Murah")
//    }

    //second approach with reference fr google - using if else

    val hargaMahal = 7501
    val hargaSedang = 4000
    val hargaMurah = 500
    val hargaMaks = 10000

    println("Menggunakan if else")
    print("Masukkan harga Makanan : ")
    var hargaMakanan = readLine()?.toIntOrNull()

    if (hargaMakanan in hargaMahal..hargaMaks){
        println("Mahal")
        println("Sedang")
    } else if (hargaMakanan in hargaMurah..hargaSedang){
        println("Murah")
    } else {
        println("Coba lagi!")
    }

    //third try with google reference - using when


    println("Menggunakan When")
    print("Masukkan harga Makanan : ")
    var foodPrice: Int? = readLine()?.toIntOrNull()

    when (foodPrice) {
        in 7501 .. 10000 -> println("Mahal")
        in 4000 .. 7500 -> println("Sedang")
        in 500 .. 3999 -> println("Murah")
        else -> println("Coba lagi bro!")
    }

}