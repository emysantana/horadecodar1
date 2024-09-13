fun main() {
    // peça ao usuário que digite seu nome
    print("digita o seu nome: ")
    val nomeDoUsuario = readLine()

    // peça ao usuário que digite sua idade
    print("digita a sua idade: ")
    val idadeDoUsuario = readLine()

    // mostre a mensagem personalizada
    if (nomeDoUsuario != null && idadeDoUsuario != null) {
        println("olá, $nomeDoUsuario, sua idade é $idadeDoUsuario")
    }
}
