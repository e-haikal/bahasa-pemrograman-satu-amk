package praktikmodul.pertemuanempat

fun main() {
    val number = Array(3) {i -> i * 3}
    for (i in 0 .. number.size-1){
        print(" " + number[i])
    }
}