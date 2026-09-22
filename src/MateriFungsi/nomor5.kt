package MateriFungsi

fun tambah(a: Double, b: Double): Double {
    return a + b
}

fun kurang(a: Double, b: Double): Double {
    return a - b
}

fun kali(a: Double, b: Double): Double {
    return a * b
}

fun bagi(a: Double, b: Double): Double {
    if (b == 0.0) {
        throw IllegalArgumentException("Kesalahan: Tidak bisa membagi dengan nol.")
    }
    return a / b
}

fun main() {
    println("=== Kalkulator Sederhana ===")
    println("Pilih operasi:")
    println("1. Penjumlahan")
    println("2. Pengurangan")
    println("3. Perkalian")
    println("4. Pembagian")

    print("Masukkan pilihan (1-4): ")
    val pilihan = readLine()?.toIntOrNull()

    print("Masukkan bilangan pertama: ")
    val a = readLine()?.toDoubleOrNull()

    print("Masukkan bilangan kedua: ")
    val b = readLine()?.toDoubleOrNull()

    if (pilihan != null && a != null && b != null) {
        try {
            val hasil = when (pilihan) {
                1 -> tambah(a, b)
                2 -> kurang(a, b)
                3 -> kali(a, b)
                4 -> bagi(a, b)
                else -> {
                    println("Pilihan tidak valid.")
                    return
                }
            }
            println("Hasil: $hasil")
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    } else {
        println("Input tidak valid")
    }
}