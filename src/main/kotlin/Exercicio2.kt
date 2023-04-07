fun main() {
    val num = 21
    println(fibonacci(num))
}

fun fibonacci(num: Int): String {
    // inicializa a sequência de Fibonacci
    var fibonacci = listOf(0, 1)

    // calcula a sequência até que o último número seja maior ou igual ao número fornecido
    while (fibonacci.last() < num) {
        val nextNum = fibonacci.last() + fibonacci[fibonacci.lastIndex - 1]
        fibonacci = fibonacci.plus(nextNum)
    }

    // verifica se o número fornecido pertence à sequência
    return if (num in fibonacci) {
        "$num pertence à sequência de Fibonacci: $fibonacci"
    } else {
        "$num não pertence à sequência de Fibonacci: $fibonacci"
    }
}