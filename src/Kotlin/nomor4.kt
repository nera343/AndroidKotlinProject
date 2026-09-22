package Kotlin

fun main(){
    val pi: Double = 3.14159
    print("Masukkan panjang jari-jari:")
    val r: Double = readLine()!!.toDouble()

    val luas = pi*r*r
    val keliling = 2*pi*r

    println("Luas lingkaran $luas")
    println("Keliling Linkgaran $keliling")

}