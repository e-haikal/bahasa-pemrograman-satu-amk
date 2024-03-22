package praktikmodul.pertemuanempat

fun main() {
    val numArr1 = arrayOf(1, 2, 3, 4)
    for (i in 0..numArr1.size-1){
        print(" "+numArr1[i])
    }

    val numArr2 = arrayOf<Int>(100, 200, 300, 400)
    println("")
    for (i in 0 .. numArr2.size-1){
        print(" " + numArr2[i])
    }
}