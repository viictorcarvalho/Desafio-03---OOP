package Produtos

abstract class Produtos(val codigoProduto: String = "", val nomeProduto: String = "", val valorProduto: Double = 0.0) {

    fun exibirProdutos(){
        println("Código: $codigoProduto | Produto: $nomeProduto | Valor: $valorProduto")
    }
}