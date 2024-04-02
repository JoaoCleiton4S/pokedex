fun verificarStatusAprovacao(media: Float) {
    if (media >= 7) {
        println("Aprovado")
    } else if (media > 4) { // Entre 4,1 e 6,9
        println("Em substituição")
    } else {
        println("Reprovado")
    }
}