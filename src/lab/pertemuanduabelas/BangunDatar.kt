package lab.pertemuanduabelas

import java.util.Scanner

open class BangunDatar {
    open fun hitungLuas(): Double {
        return 0.0
    }

    open fun hitungKeliling(): Double {
        return 0.0
    }
}

class Persegi : BangunDatar() {
    private var s: Double = 0.0

    fun setS(sisi: Double) {
        s = sisi
    }

    fun getS(): Double {
        return s
    }

    override fun hitungLuas(): Double {
        return s * s
    }

    override fun hitungKeliling(): Double {
        return 4 * s
    }
}

class PersegiPanjang : BangunDatar() {
    private var panjang: Double = 0.0
    private var lebar: Double = 0.0

    fun setPanjang(panjang: Double) {
        this.panjang = panjang
    }

    fun setLebar(lebar: Double) {
        this.lebar = lebar
    }

    override fun hitungLuas(): Double {
        return panjang * lebar
    }

    override fun hitungKeliling(): Double {
        return 2 * (panjang + lebar)
    }
}

class Lingkaran : BangunDatar() {
    private var jariJari: Double = 0.0

    fun setJariJari(jariJari: Double) {
        this.jariJari = jariJari
    }

    override fun hitungLuas(): Double {
        return Math.PI * jariJari * jariJari
    }

    override fun hitungKeliling(): Double {
        return 2 * Math.PI * jariJari
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        println("-------------------------------------------")
        println("| PROGRAM MENGHITUNG LUAS DAN KELILING BANGUN DATAR |")
        println("-------------------------------------------")
        println("1. Persegi")
        println("2. Persegi Panjang")
        println("3. Lingkaran")
        println("4. Keluar")
        println("Bangun Datar mana yang kamu pilih [1 / 2 / 3 / 4]? ")

        when (scanner.nextInt()) {
            1 -> {
                val persegi = Persegi()
                println("Belajar menghitung luas dan keliling persegi")
                println("Inputkan sisi persegi: ")
                val sisiPersegi = scanner.nextDouble()
                persegi.setS(sisiPersegi)
                println("Luas Persegi = ${persegi.hitungLuas()}")
                println("Keliling Persegi = ${persegi.hitungKeliling()}")
            }
            2 -> {
                val persegiPanjang = PersegiPanjang()
                println("Belajar menghitung luas dan keliling persegi panjang")
                println("Inputkan panjang persegi panjang: ")
                val panjang = scanner.nextDouble()
                println("Inputkan lebar persegi panjang: ")
                val lebar = scanner.nextDouble()
                persegiPanjang.setPanjang(panjang)
                persegiPanjang.setLebar(lebar)
                println("Luas Persegi Panjang = ${persegiPanjang.hitungLuas()}")
                println("Keliling Persegi Panjang = ${persegiPanjang.hitungKeliling()}")
            }
            3 -> {
                val lingkaran = Lingkaran()
                println("Belajar menghitung luas dan keliling lingkaran")
                println("Inputkan jari-jari lingkaran: ")
                val jariJari = scanner.nextDouble()
                lingkaran.setJariJari(jariJari)
                println("Luas Lingkaran = ${lingkaran.hitungLuas()}")
                println("Keliling Lingkaran = ${lingkaran.hitungKeliling()}")
            }
            4 -> {
                println("Terima kasih telah menggunakan program ini!")
                return
            }
            else -> {
                println("Pilihan tidak valid. Silakan coba lagi.")
            }
        }

        println("Apakah kamu ingin belajar bangun datar lainnya? [y/n]")
        if (scanner.next().lowercase() != "y") {
            println("Terima kasih telah menggunakan program ini!")
            break
        }
    }
}
