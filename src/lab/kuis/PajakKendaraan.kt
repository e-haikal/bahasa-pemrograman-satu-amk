package lab.kuis

interface Kendaraan {
    val nilaiJual: Double

    fun hitungPajak(): Double
}

class Mobil(override val nilaiJual: Double) : Kendaraan {
    companion object {
        const val SWDKLLJ = 143000.0
        const val ADMINISTRASI = 50000.0
        const val PKB_PERSEN = 0.02 // 2%
    }

    override fun hitungPajak(): Double {
        val pkb = nilaiJual * PKB_PERSEN
        return SWDKLLJ + pkb + ADMINISTRASI
    }
}

class Motor(override val nilaiJual: Double) : Kendaraan {
    companion object {
        const val SWDKLLJ = 35000.0
        const val ADMINISTRASI = 50000.0
        const val PKB_PERSEN = 0.02 // 2%
    }

    override fun hitungPajak(): Double {
        val pkb = nilaiJual * PKB_PERSEN
        return SWDKLLJ + pkb + ADMINISTRASI
    }
}

fun main() {
    val mobil = Mobil(300_000_000.0) //nilai jual mobil
    val motor = Motor(25_000_000.0) //nilai jual motor

    println("Pajak mobil: ${mobil.hitungPajak()}")
    println("Pajak motor: ${motor.hitungPajak()}")
}
