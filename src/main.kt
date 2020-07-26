fun main() {
//    for (i in 1..5) {
//        val titular = "Anthony " + i
//        val numeroConta = "100" + i
//        var saldo = 1000.0 * i
//
//        println("O nome do titular é: $titular")
//        println("O numero da conta é: $numeroConta")
//        println("O saldo é: $saldo")
//        println()
//    }
//    for (i in 5 downTo 1) {
//        val titular = "Anthony " + i
//        val numeroConta = "100" + i
//        var saldo = 1000.0 * i
//
//        println("O nome do titular é: $titular")
//        println("O numero da conta é: $numeroConta")
//        println("O saldo é: $saldo")
//        println()
//    }
//    for (i in 5 downTo 1 step  2) {
//        val titular = "Anthony " + i
//        val numeroConta = "100" + i
//        var saldo = 1000.0 * i
//
//        println("O nome do titular é: $titular")
//        println("O numero da conta é: $numeroConta")
//        println("O saldo é: $saldo")
//        println()
//    }
    var i = 1
//    while (i <= 5) {
//        val titular = "Anthony " + i
//        val numeroConta = "100" + i
//        var saldo = 1000.0 * i
//
//        println("O nome do titular é: $titular")
//        println("O numero da conta é: $numeroConta")
//        println("O saldo é: $saldo")
//        println()
//        i++
//    }
    do {
        val titular = "Anthony " + i
        val numeroConta = "100" + i
        var saldo = 1000.0 * i

        println("O nome do titular é: $titular")
        println("O numero da conta é: $numeroConta")
        println("O saldo é: $saldo")
        println()
        i++
    } while (i <= 5)
}

fun testaCondicoes(saldo: Double) {
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