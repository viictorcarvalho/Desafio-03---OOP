package carrinho

import produtos.*
import QNT

class Carrinho {
    var xBurguer = XBurguer()
    var xSalada = XSalada()
    var refrigerante = Refrigerante()
    var suco = Suco()

    var codigo = 10

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
            println("$codigo - ${produto.nomeProduto} | Qntd: ${produto.qntdProduto} | Valor: ${produto.somaTotal}")
        }
        println("Total: $totalCarrinho")
    }

    private fun somaTotalCarrinho() {
        var soma = 0.0
        listaItens.forEach { codigo, produto ->
            soma += produto.somaTotal
        }
        totalCarrinho = soma
    }
}
