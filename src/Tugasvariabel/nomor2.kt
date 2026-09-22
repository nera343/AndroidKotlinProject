package Tugasvariabel
fun main() {
    var a: Int = 10
    var b: Int = 20

    println("Sebelum ditukar:")
    println("A = $a")
    println("B = $b")

    // Proses penukaran dengan variabel sementara
    val temp = a
    a = b
    b = temp

    println("\nSetelah ditukar:")
    println("A = $a")
    println("B = $b")
}
