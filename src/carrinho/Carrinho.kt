package carrinho

import Produtos.*
import QNT

class Carrinho {
    var xBurguer = XBurguer()
    var xSalada = XSalada()
    var refrigerante = Refrigerante()
    var suco = Suco()

    private val listaItens = ArrayList<Produtos>()

    fun pedirQuantidade(): Int {
        println(QNT)
        return readln().toIntOrNull() ?: 0
    }

    fun valorParcial(qntd: Int, valorUnitario: Double): Double {

        val valorParcial = qntd * valorUnitario
        return valorParcial
    }

    fun quantidadeXBurguer() {
        val qnt = pedirQuantidade()
        val valorParcial = valorParcial(qnt, 10.0)
        val produto = Produtos(
            nomeProduto = "XBurguer",
            valorProduto = 10.0,
            qntdProduto = 0
        )
        listaItens.add(produto)
        println("Valor parcial: R$ ${valorParcial}")
    }

    fun quantidadeXSalada() {
        val qnt = pedirQuantidade()
        val valorParcial = valorParcial(qnt, 12.0)
        val produto = Produtos(
            nomeProduto = "XBurguer",
            valorProduto = 12.0,
            qntdProduto = 0
        )
        listaItens.add(produto)
        println("Valor parcial: R$ ${valorParcial}")
    }

    fun quantidadeRefrigerante() {
        val qnt = pedirQuantidade()
        val valorParcial = valorParcial(qnt, 8.0)
        val produto = Produtos(
            nomeProduto = "XBurguer",
            valorProduto = 8.0,
            qntdProduto = 0
        )
        listaItens.add(produto)
        println("Valor parcial: R$ ${valorParcial}")
    }

    fun quantidadeSuco() {
        val qnt = pedirQuantidade()
        val valorParcial = valorParcial(qnt, 6.0)
        val produto = Produtos(
            nomeProduto = "XBurguer",
            valorProduto = 6.0,
            qntdProduto = 0
        )
        listaItens.add(produto)
        println("Valor parcial: R$ ${valorParcial}")
    }




    }
//    fun adicionarProdutos(numTipoProduto: Int, numItem: Int, qtd: Int) {
//        val produto = escolhaProduto.escolhaDoProduto(numTipoProduto, numItem)
//        if(produto != null) {
//            val produtoNaCesta = verificarCesta(produto)
//            if(produtoNaCesta) {
//                cesta[produto] = qtd
//            }else{
//                val qtdCesta = cesta[produto] ?: 0
//                cesta[produto] = qtdCesta + qtd
//            }
//        }
//    }
//
//    private fun verificarCesta(cestaProdutos: HashMap<Produtos, Int>, id: Int): Boolean {
//        cestaProdutos.forEach {
//            if (it.key.codProduto == id) {
//                return true
//            }
//        }
//        return false
//    }
//
//    fun adicionarItens() {
//
//        listaItens.add(XBurguer())
//        listaItens.add(XSalada())
//        listaItens.add(Refrigerante())
//        listaItens.add(Suco())
//    }
//    fun deletarItens(id: Int) {
//        val produto = escolhaProduto.escolherProdutoPorId(id)
//        println (produto)
//    }
//    fun exibirListaItens() {
//        listaItens.forEach { it ->
//            println("Código: ${it.codProduto} | Nome: ${it.nomeProduto} | Preço: ${it.valorProduto} | Quantidade ${it.qntdProduto}")
//        }
//    }
//
//    fun calcularValorTotal() {
//        var valorTotal = 0.0
//
//        for (produto: Produtos in listaItens) {
//            val totalProduto = produto.valorProduto * produto.qntdProduto
//            valorTotal += totalProduto
//        }
//        println("O valor da compra é: $valorTotal")
//    }
//}
//
//fun main() {
//    val produtos = hashMapOf<Produtos, Int>()
//    val carrinho = Carrinho()
//
//    carrinho.adicionarProdutos(1, 1, 3)
//    carrinho.adicionarProdutos(1, 1, 3)
//    carrinho.adicionarProdutos(2, 1, 3)
//    carrinho.adicionarProdutos(2, 2, 3)
//    carrinho.adicionarProdutos(2, 2, 3)
//    carrinho.adicionarProdutos(2, 2, 1)
//    carrinho.deletarProduto(1)
//
//    println(produtos)
//}