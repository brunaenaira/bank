fun main() {
    val diobank = Banco(nome ="Dio",numero = 5)

    println(diobank.nome)
    println(diobank.numero)

    val banco2 = diobank.copy(nome = "Banco2")

    println(banco2.info())
}