package Kotlin

fun main(){
    print("Masukkan suhu dalam celcius:")
    val celcius = readLine()?.toDoubleOrNull()

    if (celcius != null){
        val fahrenheit = (celcius * 9/5)+32
            val kelvin = celcius + 273.15

            println("Suhu dalam celcius $celcius")
            println("Kelvin: $kelvin")
            println("fahrenheit $fahrenheit")
        }else{
            println("Harap masukkan nilai")
    }
}