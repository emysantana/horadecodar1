fun main() {
    // Solicita ao usuário que informe o seu nome
    print("Digite o seu nome: ")
    val nomeDoUsuario = readLine()

    // Exibe a mensagem de saudação
    if (nomeDoUsuario != null) {
        println("Olá, $nomeDoUsuario")
    }
}
