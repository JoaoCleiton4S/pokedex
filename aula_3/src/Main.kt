fun main() {
    val palavra = "Morango"
    val frutas = listOf("Maça", "Banana", "Pêra", "Melancia")

    val contem = verificarPalavraNoArray(
        palavra,
        frutas
    )
    if (contem)
        println("A palavra $palavra está na lista de frutas")
    else
        println("A palavra $palavra NÃO está na lista de frutas")
}

fun analisarNumeros() {
    val numeros = mutableListOf<Float>()
    for (i in 1..10) {
        println("Digite o $i° número")
        numeros.add(readln().toFloat())
    }
    // Quantos são positivos
    val positivos = numeros.filter { numero ->
        numero > 0
    }
    // Quantos são negativos
    val negativos = numeros.filter { numero -> numero < 0 }
    // Quantos são pares
    val pares = numeros.filter { numero ->
        numero % 2 == 0f
    }
    // Quantos são ímpares
    val impares = numeros.filter { numero ->
        numero % 2 != 0f
    }

    // Imprimindo as listas
    println("São positivos: $positivos")
    println("São negativos: $negativos")
    println("São pares: $pares")
    println("São ímpares: $impares")
}

fun verificarPalavraNoArray(palavra: String, listaDePalavras: List<String>): Boolean {
    return listaDePalavras.contains(palavra)
}
