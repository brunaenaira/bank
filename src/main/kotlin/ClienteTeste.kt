fun main () {
    val tchala = Cliente(
        nome = "Tchala Wakanda",
        cpf = "234.234.234-23",
        clienteTipo = ClienteTipo.PF,
        senha = "234234"
    )

    println(tchala)

    AutenticacaoTeste().autentica(tchala)
}