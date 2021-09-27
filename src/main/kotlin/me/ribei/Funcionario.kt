package me.ribei

//comecando por aqui - criacao de um data class de funcionarios
data class  Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {

    override fun toString(): String =
        """
            Nome:    $nome
            Salario: $salario
            """.trimIndent()

}