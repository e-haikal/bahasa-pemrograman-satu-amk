package lab.pertemuanlima

fun kali(a: Int, b: Int): Int {
    return (a * b)
}
val bagi = {a: Int, b: Int -> a / b}
fun main(args: Array<String>) {
    println("Kalkulator sederhana")
    var n1 = 7
    var n2 = 4
    println(kali(n1, n2))
    println(bagi(n1,n2))

}