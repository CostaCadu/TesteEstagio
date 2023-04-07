fun main() {
    // pede ao usuário para digitar a string
    print("Digite uma string: ")
    val stringOriginal = readLine()!!

    // cria uma lista vazia para armazenar os caracteres invertidos
    val stringInvertida = mutableListOf<Char>()

    // percorre os caracteres da string original de trás para frente e adiciona à lista
    for (i in stringOriginal.length-1 downTo 0) {
        stringInvertida.add(stringOriginal[i])
    }

    // junta os caracteres invertidos em uma única string
    val stringFinal = stringInvertida.joinToString("")

    // imprime a string invertida na tela
    println("A string invertida é: $stringFinal")
}