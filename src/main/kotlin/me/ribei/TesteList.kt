package me.ribei

//instanciando o data class
fun main (){
    val joao = Funcionario("Joao", 1000.0)
    val pedro = Funcionario("Pedro", 2000.0)
    val maria = Funcionario("Maria", 4000.0)

    val funcionarios = listOf(joao, maria, pedro)

    //olhar funcionarios que estao dentro da lista de funcionarios
    funcionarios.forEach { println(it) } //o it aqui eh a instancia do objeto referenciado em cada variavel e alocado em uma lista
    println("--------------------------------")


    //encontrar um funcionario especifico
    println(funcionarios.find { it.nome == "Maria" })

}

//comecando por aqui - criacao de um data class de funcionarios
data class  Funcionario(
    val nome: String,
    val salario: Double
) {

    override fun toString(): String =
        """
            Nome:    $nome
            Salario: $salario
            """.trimIndent()

}