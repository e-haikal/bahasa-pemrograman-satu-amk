abstract class Karyawan(
    val idKaryawan: String,
    val nama: String,
    val jenisKelamin: String,
    val statusPernikahan: String,
    val jumlahAnak: Int,
    val telp: String,
    val gajiPokok: Double
) {
    abstract fun gaji(): Double

    protected fun tunjanganIstri(): Double {
        return if (jenisKelamin == "Laki-Laki" && statusPernikahan == "Menikah") 1_000_000.0 else 0.0
    }

    protected fun tunjanganAnak(): Double {
        return if (statusPernikahan != "Belum Menikah") minOf(jumlahAnak, 2) * 500_000.0 else 0.0
    }

    protected fun pph(gaji: Double): Double {
        return gaji * 0.025
    }
}

class Manajer(
    idKaryawan: String,
    nama: String,
    jenisKelamin: String,
    statusPernikahan: String,
    jumlahAnak: Int,
    telp: String,
    gajiPokok: Double,
    val tunjanganBisnis: Double,
    val tunjanganTransport: Double
) : Karyawan(idKaryawan, nama, jenisKelamin, statusPernikahan, jumlahAnak, telp, gajiPokok) {
    override fun gaji(): Double {
        val totalGaji = gajiPokok + tunjanganIstri() + tunjanganAnak() + tunjanganBisnis + tunjanganTransport
        return totalGaji - pph(totalGaji)
    }
}

class Staff(
    idKaryawan: String,
    nama: String,
    jenisKelamin: String,
    statusPernikahan: String,
    jumlahAnak: Int,
    telp: String,
    gajiPokok: Double,
    val tunjanganMakan: Double
) : Karyawan(idKaryawan, nama, jenisKelamin, statusPernikahan, jumlahAnak, telp, gajiPokok) {
    override fun gaji(): Double {
        val totalGaji = gajiPokok + tunjanganIstri() + tunjanganAnak() + tunjanganMakan
        return totalGaji - pph(totalGaji)
    }
}

fun main() {
    val manajer = Manajer(
        idKaryawan = "M001",
        nama = "Haikal skuyy",
        jenisKelamin = "Laki-Laki",
        statusPernikahan = "Menikah",
        jumlahAnak = 2,
        telp = "-",
        gajiPokok = 10_000_000.0,
        tunjanganBisnis = 3_000_000.0,
        tunjanganTransport = 2_000_000.0
    )

    val staff = Staff(
        idKaryawan = "S001",
        nama = "Akira",
        jenisKelamin = "Perempuan",
        statusPernikahan = "Menikah",
        jumlahAnak = 1,
        telp = "-",
        gajiPokok = 7_000_000.0,
        tunjanganMakan = 1_500_000.0
    )

    println("Gaji Manajer: ${manajer.gaji()}")
    println("Gaji Staff: ${staff.gaji()}")
}
