fun main() {
    // Solicita ao usuário que informe seu nome
    print("Digite o seu nome: ")
    val nomeDoUsuario = readLine()

    // Solicita ao usuário que informe sua idade
    print("Digite a sua idade: ")
    val idadeDoUsuario = readLine()

    // Exibe a mensagem personalizada
    if (nomeDoUsuario != null && idadeDoUsuario != null) {
        println("Olá, $nomeDoUsuario, sua idade é $idadeDoUsuario")
    }
}
