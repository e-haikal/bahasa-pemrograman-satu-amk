package lab.pertemuanlima
fun segitiga(a: Int, t: Int): Double{
    return(0.5 * a * t)
}

fun persegi(s: Int){
    println("Luas persegi : " + (s*s) )
}

fun main() {
    //luas segitiga
    println("Luas segitiga : " + segitiga(10,5))

    //luas persegi
    persegi(4)
}