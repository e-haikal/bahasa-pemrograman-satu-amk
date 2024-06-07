        package lab.pertemuandelapan

        fun main() {
            val text: String? = null

            println("Menggunakan let function")
            text?.let {
                println("$text")
                println("Panjang teks: ${text.length}")
            }

            println("Menggunakan run function")
            text?.run {
                println("$text")
                println("Panjang teks: ${text.length}")
            }

            println("Menggunakan with function")
            with(text) {
                println("$text")
                println("Panjang teks: ${text!!.length}")
            }
        }
