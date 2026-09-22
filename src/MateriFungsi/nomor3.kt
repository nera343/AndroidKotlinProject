package MateriFungsi

fun cekGenapGanjil(bilangan: Int): String {
    return if (bilangan % 2 == 0) "Genap" else "Ganjil"
}

fun main() {
    print("Masukkan bilangan: ")
    val input = readLine()?.toIntOrNull()

    if (input != null) {
        val hasil = cekGenapGanjil(input)
        println("$input merupakan bilangan $hasil")
    } else {
        println("Input tidak valid. Harap masukkan angka bulat.")
    }
}
