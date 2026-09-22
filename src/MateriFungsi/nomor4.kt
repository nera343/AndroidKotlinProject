package MateriFungsi

fun hitungNilaiAkhir(tugas: Double, uts: Double, uas: Double): Double {
    return (tugas * 0.30) + (uts * 0.30) + (uas * 0.40)
}

fun tentukanGrade(nilai: Double): String {
    return when {
        nilai >= 80 -> "A"
        nilai >= 70 -> "B"
        nilai >= 60 -> "C"
        nilai >= 50 -> "D"
        else -> "E"
    }
}

fun main() {
    val namaMahasiswa = "Andi Saputra"
    val tugas = 85.0
    val uts = 75.0
    val uas = 90.0

    val nilaiAkhir = hitungNilaiAkhir(tugas, uts, uas)
    val grade = tentukanGrade(nilaiAkhir)

    println("Nama Mahasiswa : $namaMahasiswa")
    println("Nilai Akhir    : $nilaiAkhir")
    println("Grade          : $grade")
}
