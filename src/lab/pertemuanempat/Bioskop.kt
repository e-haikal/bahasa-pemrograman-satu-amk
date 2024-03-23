package lab.pertemuanempat

fun main() {
    val daftarFilm = setOf(
        "Spider-Man: Across the Spider-Verse",
        "The Super Mario Bros Movie",
        "Balada si Roy",
        "Shazam! Fury of the Gods",
        "Transformer : Rise of the Beasts"
    )

    print("Masukkan judul film yang ingin ditonton: ")
    val judulFilm = readLine()!!

    if (daftarFilm.contains(judulFilm)) {
        println("Film tersedia")
    } else {
        println("Film tidak tayang")
    }
}
