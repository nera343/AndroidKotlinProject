package Kotlin

fun main(){
    print("Masukkan bilangan desimal:")
    val dec: Double = readLine()!!.toDouble()

    val desimalKedouble: Double = dec.toDouble()
    val desimalkeInt: Int = dec.toInt()
    val desimalkestring : String = dec.toString()

    println("Nilai double $desimalKedouble")
    println("Nilai Int $desimalkeInt")
    println("Nilai String $desimalkestring")
}