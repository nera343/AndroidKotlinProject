package Kotlin

import java.lang.Exception

fun main() {
    try {
        // Meminta input dari pengguna
        print("Masukkan karakter: ")
        val input = readLine()

        // Validasi input: tidak boleh null atau kosong
        if (input.isNullOrEmpty()) {
            println("Input tidak boleh kosong.")
            return
        }

        // Ambil hanya karakter pertama
        val karakter: Char = input.first()

        // Menampilkan informasi karakter
        println("Karakter       : $karakter")
        println("Kode karakter  : ${karakter.code}") // Unicode/ASCII code
        println("Termasuk huruf : ${karakter.isLetter()}")
        println("Termasuk angka : ${karakter.isDigit()}")

    } catch (e: Exception) {
        println("Terjadi kesalahan: ${e.message}")
    }
}