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

    println("Berhasil....")
    println("Luas segitiga : " + segitigaMod(alas, tinggi))
    println("------------------------------------------------")

    //luas persegi
    //input nilai sisi
    print("\nMasukkan nilai sisi = ")
    val sisi = readLine()!!.toInt()

    println("Berhasil")
    persegiMod(sisi)
    println("------------------------------------------------")

}