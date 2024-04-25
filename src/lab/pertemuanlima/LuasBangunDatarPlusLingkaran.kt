package lab.pertemuanlima

fun segitigaModif(a: Int, t: Int): Double{
    return(0.5 * a * t)
}
fun persegiModif(s: Int){
    println("Luas persegi : " + (s*s) )
}
fun luasLingkaran(jariJari: Double): Double{
    return (3.14 *  jariJari * jariJari)
}

fun luasTrapesium(alasa: Double, alasb: Double, tinggitr: Double): Double{
    return  (0.5 * (alasa + alasb) * tinggitr)
}

fun main() {
    //luas segitiga
    print("Masukkan Alas Segitiga = ")
    val alas = readLine()!!.toInt()

    print("Masukkan Tinggi Segitiga = ")
    val tinggi = readLine()!!.toInt()

    println("Berhasil....")
    println("Luas segitiga : " + segitigaModif(alas, tinggi))
    println("------------------------------------------------")

    //luas persegi
    print("\nMasukkan nilai sisi = ") //input nilai persegi
    val sisi = readLine()!!.toInt()

    println("Berhasil")
    persegiModif(sisi)
    println("------------------------------------------------")

    //luas lingkaran
    println("\nMasukkan jari-jari lingkaran = ") //input jari-jari lingkaran
    val jari = readLine()!!.toDouble()

    println("Berhasil")
    println("Luas lingkaran = " + luasLingkaran(jari))

    //luas trapesium
    println("\nMenghitung Luas Trapesium")
    println("Masukkan alas A = ")
    val alasaTrapesium = readLine()!!.toDouble()

    println("Masukkan alas B = ")
    val alasbTrapesium = readLine()!!.toDouble()

    println("Masukkan tinggi Trapesium = ")
    val tinggiTrapesium = readLine()!!.toDouble()

    println("Berhasil")
    println("Luas Trapesium = " + luasTrapesium(alasaTrapesium, alasbTrapesium, tinggiTrapesium))
}