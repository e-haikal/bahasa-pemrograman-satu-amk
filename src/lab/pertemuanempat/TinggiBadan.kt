package lab.pertemuanempat

fun main() {
    var tinggi:MutableSet<Int> = mutableSetOf(155, 160, 170, 165, 150, 180, 185, 170, 175, 165)
    println("Tingi badan : $tinggi")
    println("Tinggi rata-rata : " + tinggi.average() )

    //menampilkan tinggi badan tertinggi
    println("Tinggi badan tertinggi : " + tinggi.max() )

    //menampilkan tinggi badan tertinggi
    println("Tinggi badan terendah : " + tinggi.min() )


    //menambahkan data
    println("\nSetelah data tinggi badan ditambahkan")
    tinggi.addAll(
        setOf(177, 185, 168)
    )
    println(tinggi)

    //menghapus tinggi badan 150
    tinggi.remove(150)
    println("\nSetelah tinggi badan 150 dihapus")
    print(tinggi)

    //ubah tinggi badan 185 jadi 186
    tinggi.remove(185)
    tinggi.add(186)

    println("\n\nSetelah data tinggi diubah 185 >> 186")
    print(tinggi)
}