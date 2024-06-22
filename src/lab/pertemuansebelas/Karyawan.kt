package lab.pertemuansebelas

class Karyawan {
    private var nik = ""
    private var nama = ""
    private var gaji = 0
    private var departemen = ""

    fun input(nik:String, nama:String, gaji: Int, departemen: String){
        //cek nik
        this.nik = nik
        this.nama = nama
        this.gaji = gaji
        this.departemen = departemen
    }

    fun data(){
        println("-----------Data Karyawan--------------")
        println("NIK \t\t: $nik")
        println("Nama \t\t: $nama")
        println("Gaji \t\t: $gaji")
        println("Departemen \t\t: $departemen")
    }
}

fun main() {
    var kry = Karyawan()
    kry.input("1234", "Asman Haikal", 1_000_000, "R&D")
    kry.data()
}
