package lab.pertemuanlima

fun segitigaMod(a: Int, t: Int): Double{
    return(0.5 * a * t)
}

fun persegiMod(s: Int){
    println("Luas persegi : " + (s*s) )
}

fun main() {
    //luas segitiga
    //membuat program menjadi dinamis
    print("Masukkan Alas Segitiga = ")
    val alas = readLine()!!.toInt()

    print("Masukkan Tinggi Segitiga = ")
    val tinggi = readLine()!!.toInt()

    println("\nBerhasil....")
    println("Luas segitiga : " + segitigaMod(alas, tinggi))

    //luas persegi
    //input nilai sisi

    val sisi = readLine()!!.toInt()
    persegiMod(4)
}