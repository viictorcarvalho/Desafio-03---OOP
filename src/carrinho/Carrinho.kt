package carrinho

import CODIGO_INVALIDO
import produtos.*
import QNT

class Carrinho {
    var xBurguer = XBurguer()
    var xSalada = XSalada()
    var refrigerante = Refrigerante()
    var suco = Suco()

    var codigo = 0

    var totalCarrinho = 0.0

    private val listaItens = mutableMapOf<Int, Produtos>()

    private fun pedirQuantidade(): Int {
        println(QNT)
        return readln().toIntOrNull() ?: 0
    }

    private fun valorParcial(qntd: Int, valorUnitario: Double): Double {
        return qntd * valorUnitario
    }

    private fun inserirNoCarrinho(produto: Produtos): Int {
        codigo += 1
        listaItens[codigo] = produto
        return codigo
    }

    fun quantidadeXBurguer() {
        val qnt = pedirQuantidade()
        val valorParcial = valorParcial(qnt, 10.0)
        val produto = Produtos(
            nomeProduto = "XBurguer",
            valorProduto = 10.0,
            qntdProduto = qnt,
            valorParcial
        )
        inserirNoCarrinho(produto)
        somaTotalCarrinho()
    }

    fun quantidadeXSalada() {
        val qnt = pedirQuantidade()
        val valorParcial = valorParcial(qnt, 12.0)
        val produto = Produtos(
            nomeProduto = "XSalada",
            valorProduto = 12.0,
            qntdProduto = qnt,
            valorParcial
        )
        inserirNoCarrinho(produto)
        somaTotalCarrinho()
    }

    fun quantidadeRefrigerante() {
        val qnt = pedirQuantidade()
        val valorParcial = valorParcial(qnt, 8.0)
        val produto = Produtos(
            nomeProduto = "Refrigerante",
            valorProduto = 8.0,
            qntdProduto = qnt,
            valorParcial
        )
        inserirNoCarrinho(produto)
        somaTotalCarrinho()
    }

    fun quantidadeSuco() {
        val qnt = pedirQuantidade()
        val valorParcial = valorParcial(qnt, 6.0)
        val produto = Produtos(
            nomeProduto = "Suco",
            valorProduto = 6.0,
            qntdProduto = qnt,
            valorParcial
        )
        inserirNoCarrinho(produto)
        somaTotalCarrinho()
    }

    fun exibirCarrinho() {
        listaItens.forEach { codigo, produto ->
            println("Código: $codigo | ${produto.nomeProduto} | Qntd: ${produto.qntdProduto} | Valor: ${produto.somaTotal}")
        }
        println("Total: $totalCarrinho")
    }

    fun editarCarrinho() {
        val codigoDigitado = selecaoCodigo()
        if (codigoDigitado in listaItens) {
            val produto = listaItens[codigoDigitado]
            if (produto != null) {
                println("Digite a nova quantidade desejada: ")
                produto.qntdProduto = readln().toIntOrNull() ?: 0
                produto.somaTotal = produto.qntdProduto * produto.valorProduto
            }
            println("Produto alterado com sucesso!")
            somaTotalCarrinho()
        } else {
            println(CODIGO_INVALIDO)
            editarCarrinho()
        }
    }

    fun removerItemCarrinho() {
        val codigoDigitado = selecaoCodigo()
        if (codigoDigitado in listaItens) {
            listaItens.remove(codigoDigitado)
            println("Produto removido com sucesso!")
            somaTotalCarrinho()
        } else {
            println(CODIGO_INVALIDO)
            removerItemCarrinho()
        }
    }

    fun selecaoCodigo(): Int {
        println("Digite o código do produto desejado: ")
        return readln().toIntOrNull() ?: 0
    }

    private fun somaTotalCarrinho() {
        var soma = 0.0
        listaItens.forEach { codigo, produto ->
            soma += produto.somaTotal
        }
        totalCarrinho = soma
    }
}
