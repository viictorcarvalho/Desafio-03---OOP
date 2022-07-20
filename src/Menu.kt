import Pagamento.Pagamentos
import carrinho.Carrinho
import kotlin.system.exitProcess

class Menu {
    private val carrinho = Carrinho()

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

    fun menuLanche() {
        while (true) {
            println("Qual lanche você deseja? Temos essas duas opções: ")
            println("[1] X-Burguer [R$ 10,00] ")
            println("[2] X-Salada [R$ 12,00] ")
            val opcao = readln().toIntOrNull()
            when (opcao) {
                1 -> {
                    println("X-Burguer [R\$ 10,00] ")
                    carrinho.quantidadeXBurguer()
                    carrinho.exibirCarrinho()
                    println(MAIS_PRODUTOS)
                    val opcao = readln().toIntOrNull()
                    when (opcao) {
                        3 -> {
                            menuPrimario()
                        }
                        4 -> {
                            menuPagamento()
                        }
                        else -> {
                            println(OPCAO_INVALIDA)
                            println(MAIS_PRODUTOS)
                        }
                    }
                }
                2 -> {
                    println("X-Salada [R\$ 12,00] ")
                    carrinho.quantidadeXSalada()
                    carrinho.exibirCarrinho()
                    println(MAIS_PRODUTOS)
                    val opcao = readln().toIntOrNull()
                    when (opcao) {
                        3 -> {
                            menuPrimario()
                        }
                        4 -> {
                            menuPagamento()
                        }
                        else -> {
                            println(OPCAO_INVALIDA)
                            println(MAIS_PRODUTOS)
                        }
                    }
                }
                else -> {
                    println(ESPACAMENTO)
                    println(OPCAO_INVALIDA)
                    menuLanche()
                }
            }
        }
    }

    fun menuBebida() {
        println("Qual bebida você deseja? Temos essas duas opções: ")
        println("[1] Refrigerante [R$ 8,00]")
        println("[2] Suco [R$ 6,00]")
        when (readln().toIntOrNull()) {
            1 -> {
                println("Refrigerante [R\$ 8,00] ")
                carrinho.quantidadeRefrigerante()
                carrinho.exibirCarrinho()
                println(MAIS_PRODUTOS)
                val opcao = readln().toIntOrNull()
                when (opcao) {
                    3 -> {
                        menuPrimario()
                    }
                    4 -> {
                        menuPagamento()
                    }
                    else -> {
                        println(OPCAO_INVALIDA)
                        println(MAIS_PRODUTOS)
                    }
                }
            }
            2 -> {
                println("[2] Suco [R\$ 6,00] ")
                carrinho.quantidadeSuco()
                carrinho.exibirCarrinho()
                println(MAIS_PRODUTOS)
                val opcao = readln().toInt()
                when (opcao) {
                    3 -> {
                        menuPrimario()
                    }
                    4 -> {
                        menuPagamento()
                    }
                    else -> {
                        println(ESPACAMENTO)
                        println(OPCAO_INVALIDA)
                        println(MAIS_PRODUTOS)
                    }
                }
            }
            else -> {
                println(ESPACAMENTO)
                println(OPCAO_INVALIDA)
                menuBebida()
            }
        }
    }

    fun menuPagamento() {
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