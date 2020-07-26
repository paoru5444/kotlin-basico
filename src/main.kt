fun main() {
    val titular = "Anthony Roberto"
    val numeroConta = "1000"
    var saldo = 0.0
    saldo = 5.0
    println("O nome do titular é: $titular")
    println("O numero da conta é: $numeroConta")
    println("O saldo é: $saldo")

//    if (saldo > 0.0) {
//        println("Saldo positivo")
//    } else if (saldo == 0.0) {
//        println("Saldo neutro")
//    } else {
//        println("Saldo negativo")
//    }
//
    when {
        saldo > 0.0 -> println("Saldo positivo")
        saldo === 0.0 -> println("Saldo neutro")
        else -> println("Saldo negativo")
    }
}