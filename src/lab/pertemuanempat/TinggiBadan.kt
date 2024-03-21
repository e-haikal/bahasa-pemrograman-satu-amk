package lab.pertemuanempat

fun main() {
    var tinggi:Set<Int> = setOf(155, 160, 170, 165, 150, 180, 185, 170, 175, 165)
    println("Tingi badan : $tinggi")
    println("Tinggi rata-rata : " + tinggi.average() )

    //menampilkan tinggi badan tertinggi
    println("Tinggi badan tertinggi : " + tinggi.max() )

    //menampilkan tinggi badan tertinggi
    println("Tinggi badan terendah : " + tinggi.min() )

    print(tinggi)
}