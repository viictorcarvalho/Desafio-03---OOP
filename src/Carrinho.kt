//import Produtos.*
//
//open class Carrinho {
//
//    private val listaItens: ArrayList<Produtos> = arrayListOf()
//    init {
//        adicionarItens()
//    }
//    fun adicionarItens() {
//
//        listaItens.add(XBurguer())
//        listaItens.add(XSalada())
//        listaItens.add(Refrigerante())
//        listaItens.add(Suco())
//    }
//
//    internal fun exibirListaDeItens() {
//        listaItens.forEach { it ->
//            println("Código: ${it.codigoProduto} | Nome: ${it.nomeProduto} | Preço: ${it.valorProduto}")
//        }
//    }
//
//    internal fun calcularValorTotal() {
//        var valorTotal = 0.0
//
//        for (produto: Produtos in listaItens) {
//            val totalProduto = produto.quantidade * produto.quantidade
//            valorTotal += totalProduto
//        }
//        println("O valor da compra é: $valorTotal")
//    }
//}