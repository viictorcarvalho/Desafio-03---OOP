package pagamento

class Pagamentos {

    fun pagamentoEmDinheiro(total : Double) {
        println("Digite o valor em dinheiro:")
        val dinheiroCliente = readln().toDoubleOrNull()?: -1.0
        if (dinheiroCliente < 0.0) {
            println("Valor inválido. Tente novamente.")
            return
        }
        if (dinheiroCliente < total) {
            println("Valor insuficiente. Tente novamente.")
            return
        }
        val troco = dinheiroCliente - total
        println("Seu total foi de R$$total")
        println("Seu troco: R$$troco")
    }
}