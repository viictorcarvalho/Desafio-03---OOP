package munu

import ESPACAMENTO
import MAIS_PRODUTOS
import OPCAO_INVALIDA
import PAGTO_FINALIZADO
import pagamento.Pagamentos
import carrinho.Carrinho
import kotlin.system.exitProcess

class Menu {
    private val carrinho = Carrinho()

    private fun menuMaisProdutos() {
        println(MAIS_PRODUTOS)
        when (readln().toIntOrNull()) {
            1 -> menuPrimario()

            2 -> menuSecundario()

            else -> {
                println(OPCAO_INVALIDA)
                menuMaisProdutos()
            }
        }
    }

    fun menuPrimario() {
        while (true) {
            println("O que você gostaria de consumir hoje?")
            println("[1] L A N C H E ")
            println("[2] B E B I D A ")
            when (readln().toIntOrNull()) {
                1 -> {
                    println("L A N C H E")
                    println(ESPACAMENTO)
                    menuLanche()
                }
                2 -> {
                    println("B E B I D A")
                    println(ESPACAMENTO)
                    menuBebida()
                }
                else -> {
                    println(ESPACAMENTO)
                    println(OPCAO_INVALIDA)
                    menuPrimario()
                }
            }
        }
    }

    private fun menuLanche() {
        while (true) {
            println("Qual lanche você deseja? Temos essas duas opções: ")
            println("[1] X-Burguer [R$ 10,00] ")
            println("[2] X-Salada [R$ 12,00] ")
            when (readln().toIntOrNull()) {
                1 -> {
                    println("X-Burguer [R\$ 10,00] ")
                    carrinho.quantidadeXBurguer()
                    carrinho.exibirCarrinho()
                    menuMaisProdutos()
                }
                2 -> {
                    println("X-Salada [R\$ 12,00] ")
                    carrinho.quantidadeXSalada()
                    carrinho.exibirCarrinho()
                    menuMaisProdutos()
                }
                else -> {
                    println(ESPACAMENTO)
                    println(OPCAO_INVALIDA)
                    menuLanche()
                }
            }
        }
    }

    private fun menuBebida() {
        println("Qual bebida você deseja? Temos essas duas opções: ")
        println("[1] Refrigerante [R$ 8,00]")
        println("[2] Suco [R$ 6,00]")
        when (readln().toIntOrNull()) {
            1 -> {
                println("Refrigerante [R\$ 8,00] ")
                carrinho.quantidadeRefrigerante()
                carrinho.exibirCarrinho()
                menuMaisProdutos()
            }
            2 -> {
                println("[2] Suco [R\$ 6,00] ")
                carrinho.quantidadeSuco()
                carrinho.exibirCarrinho()
                menuMaisProdutos()
            }
            else -> {
                println(ESPACAMENTO)
                println(OPCAO_INVALIDA)
                menuBebida()
            }
        }
    }

    private fun menuSecundario() {
        println("O que deseja fazer agora?")
        println("[1] - Editar produtos")
        println("[2] - Remover produtos")
        println("[3] - Acrescentar produtos")
        println("[4] - Finalizar compra")
        println("[5] - Cancelar compra e sair")
        when (readln().toIntOrNull()) {
            1 -> {
                println("[1] - Editar produtos")
                carrinho.editarCarrinho()
                carrinho.exibirCarrinho()
                menuSecundario()
            }
            2 -> {
                println("[2] - Remover produtos")
                carrinho.removerItemCarrinho()
                carrinho.exibirCarrinho()

                menuSecundario()
            }
            3 -> {
                println("[3] - Acrescentar produtos")
                menuPrimario()
            }
            4 -> {
                println("[4] - Finalizar compra")
                menuPagamento()
            }
            5 -> {
                println("[5] - Cancelar compra e sair")
                exitProcess(0)
            }
            else -> {
                println(ESPACAMENTO)
                println(OPCAO_INVALIDA)
                menuSecundario()
            }
        }

    }

    private fun menuPagamento() {
        println("Como será a forma de pagamento?")
        println("[1] - Cartão de crédito")
        println("[2] - Cartão de débito")
        println("[3] - Vale refeição")
        println("[4] - Dinheiro")
        when (readln().toIntOrNull()) {
            1 -> {
                println(PAGTO_FINALIZADO)
                exitProcess(0)
            }
            2 -> {
                println(PAGTO_FINALIZADO)
                exitProcess(0)
            }
            3 -> {
                println(PAGTO_FINALIZADO)
                exitProcess(0)
            }
            4 -> {
                val pagamentos = Pagamentos()
                pagamentos.pagamentoEmDinheiro(carrinho.totalCarrinho)
                println(PAGTO_FINALIZADO)
                exitProcess(0)
            }
            else -> {
                println(OPCAO_INVALIDA)
                menuPagamento()
            }
        }
    }
}