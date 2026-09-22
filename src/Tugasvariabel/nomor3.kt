package Tugasvariabel

fun main() {
    val namaBarang: String = "Laptop"
    val harga: Double = 7500.0
    val jumlah: Double = 2.0
    val diskon: Double = 10.0   // persen

    val subtotal: Double = harga * jumlah
    val potongan: Double = subtotal * diskon / 100
    val totalBayar: Double = subtotal - potongan

    println("Nama Barang   : $namaBarang")
    println("Harga Barang  : Rp$harga")
    println("Jumlah Barang : $jumlah")
    println("Diskon        : $diskon %")
    println("Subtotal      : Rp$subtotal")
    println("Potongan      : Rp$potongan")
    println("Total Bayar   : Rp$totalBayar")
}
