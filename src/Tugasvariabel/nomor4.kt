package Tugasvariabel

fun main(){
    val nama: String ="Ertus"
    println("Nama $nama")
    val gaji: Double = 5000.0
    val tunjangan: Double = 250.0
    val lembur: Double = 250.0
    val potongan: Double = 150.0
    val Gajiktr: Double = gaji+tunjangan+lembur
    println("Gaji kotor : $Gajiktr")

    val gajibersih: Double = Gajiktr - potongan
    println("Gaji bersih : $gajibersih")

}