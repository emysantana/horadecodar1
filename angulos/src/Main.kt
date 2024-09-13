fun main() {
    // calcule da área do retângulo
    print("digita a largura do retângulo: ")
    val larguraRetangulo = readLine()?.toDoubleOrNull() ?: return
    print("digita a altura do retângulo: ")
    val alturaRetangulo = readLine()?.toDoubleOrNull() ?: return
    val areaRetangulo = larguraRetangulo * alturaRetangulo
    println("a área do retângulo: $areaRetangulo")

    // calcule da área do triângulo
    print("digita a base do triângulo: ")
    val baseTriangulo = readLine()?.toDoubleOrNull() ?: return
    print("digita a altura do triângulo: ")
    val alturaTriangulo = readLine()?.toDoubleOrNull() ?: return
    val areaTriangulo = 0.5 * baseTriangulo * alturaTriangulo
    println("a área do triângulo: $areaTriangulo")

    // calcule da área do círculo
    print("digita o raio do círculo: ")
    val raioCirculo = readLine()?.toDoubleOrNull() ?: return
    val areaCirculo = PI * raioCirculo * raioCirculo
    println("a área do círculo: $areaCirculo")
}
