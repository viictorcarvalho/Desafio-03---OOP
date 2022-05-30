fun main() {

    print("Por favor, insira seu nome: ")
    val nomeCliente = readln()
    println(ESPACAMENTO)

    println(HIFEN)
    print("Seja bem-vindo(a) ao melhor FastFood de SimCity, $nomeCliente! \n")
    println(HIFEN)

    val menu = Menu()
    menu.menuPrimario()

}