package lab.pertemuanlima

fun kaliverdua(a: Int, b: Int): Int {
    return (a * b)
}
val bagiverdua = {a: Int, b: Int -> a.toDouble() / b.toDouble()} // Mengubah tipe data parameter dan nilai kembalian menjadi Double

val jumlahLambda = {a: Int, b: Int -> a + b}

val penguranganLambda = {a: Int, b: Int -> a - b}
fun main(args: Array<String>) {
    println("Kalkulator sederhana")
    print("Masukkan nilai pertama = ")
    var n1 = readLine()!!.toInt()

    print("Masukkan nilai kedua = ")
    var n2 = readLine()!!.toInt()

    println("Hasil kali $n1 dan $n2 = " + kaliverdua(n1, n2))
    println("Hasil bagi $n1 dan $n2 = " + bagiverdua(n1, n2))

    //output Lambda
    println("Hasil penjumlahan (menggunakan Lambda) = " + jumlahLambda(10, 10)) //penjumlahan
    println("Hasil pengurangan (menggunakan Lambda) = " + penguranganLambda(10, 10)) //pengurangan



}