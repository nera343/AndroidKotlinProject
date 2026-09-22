package Tugasvariabel

fun main(){
        val namaMahasiswa: String = "Andi Saputra"
        val tugas: Double = 80.0
        val kuis: Double = 75.0
        val uts: Double = 85.0
        val uas: Double = 90.0

        val nilaiAkhir: Double = (tugas * 0.25) + (kuis * 0.15) +
                (uts * 0.25) + (uas * 0.35)

        println("Nama Mahasiswa : $namaMahasiswa")
        println("Nilai Akhir    : $nilaiAkhir")
    }

