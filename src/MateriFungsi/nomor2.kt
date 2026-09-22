package MateriFungsi

fun hitungLuas(panjang: Double, lebar: Double): Double {
    return panjang * lebar
}

fun main() {
    val panjang: Double = 10.0
    val lebar: Double = 5.0

    val luas = hitungLuas(panjang, lebar)

    println("Panjang : $panjang")
    println("Lebar   : $lebar")
    println("Luas    : $luas")
}
