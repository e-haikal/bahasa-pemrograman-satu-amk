package lab.pertemuanlima

import java.util.Scanner

fun main(args: Array<String>) {
    var data: MutableList<Int> = mutableListOf()

    var read = Scanner(System. `in`)
    var a = 0

    print("Jumlah tinggi badan yang diinputkan = ")
    var jumlah = read.nextInt()

    do{
        data.add(read.nextInt())
        a++
    } while (a < jumlah)

    println(data)

    //tinggi badan tertinggi
    print("Tinggi badan tertinggi = " + data.max())

    //tinggi badan terendah
    print("\nTinggi badan terendah = " + data.min())

    //lambda expression dengan fiilter
    print("\nTinggi di atas 160 = " + data.filter { it > 160 })
}