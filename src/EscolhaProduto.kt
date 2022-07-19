//import Produtos.*
//
//class EscolhaProduto {
//    private val xBurguer = XBurguer()
//    private val xSalada = XSalada()
//    private val refrigerante = Refrigerante()
//    private val suco = Suco()
//
//
//    fun escolherProdutoPorId(idItem: Int): Produtos? {
//        return when(idItem){
//            xSalada.codProduto -> xSalada
//            xBurguer.codProduto -> xBurguer
//            refrigerante.codProduto -> refrigerante
//            suco.codProduto -> suco
//            else -> null
//        }
//    }
//
//    fun escolhaDoProduto(opcaoProduto: Int, opcaoItem: Int): Produtos? {
//        return when (opcaoProduto) {
//            1 -> escolherLanche(opcaoItem)
//            2 -> escolherBebida(opcaoItem)
//            else -> null
//        }
//    }
//
//    private fun escolherLanche(opcao: Int): Produtos? {
//        return when (opcao) {
//            1 -> xBurguer
//            2 -> xSalada
//            else -> null
//        }
//    }
//
//    private fun escolherBebida(opcao: Int): Produtos? {
//        return when (opcao) {
//            1 -> refrigerante
//            2 -> suco
//            else -> null
//        }
//    }
//}