package lab.pertemuandelapan

fun main() {
    // Meminta input username dan password dari pengguna
    print("Masukkan username: ")
    val username = readLine()
    print("Masukkan password: ")
    val password = readLine()

    // Validasi username dan password
    if (username != null && password != null && username.length > 2 && password.all { it.isDigit() } && password.length >= 6) {
        println("Akun berhasil dibuat!")
    } else {
        println("Informasi: Akun gagal dibuat!")
    }
}
