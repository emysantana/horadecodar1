fun main() {
    // Cálculo da área do retângulo
    print("Digite a largura do retângulo: ")
    val larguraRetangulo = readLine()?.toDoubleOrNull() ?: return
    print("Digite a altura do retângulo: ")
    val alturaRetangulo = readLine()?.toDoubleOrNull() ?: return
    val areaRetangulo = larguraRetangulo * alturaRetangulo
    println("Área do retângulo: $areaRetangulo")

    // Cálculo da área do triângulo
    print("Digite a base do triângulo: ")
    val baseTriangulo = readLine()?.toDoubleOrNull() ?: return
    print("Digite a altura do triângulo: ")
    val alturaTriangulo = readLine()?.toDoubleOrNull() ?: return
    val areaTriangulo = 0.5 * baseTriangulo * alturaTriangulo
    println("Área do triângulo: $areaTriangulo")

    // Cálculo da área do círculo
    print("Digite o raio do círculo: ")
    val raioCirculo = readLine()?.toDoubleOrNull() ?: return
    val areaCirculo = PI * raioCirculo * raioCirculo
    println("Área do círculo: $areaCirculo")
}
