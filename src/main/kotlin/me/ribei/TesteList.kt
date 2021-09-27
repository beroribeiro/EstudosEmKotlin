package me.ribei

//instanciando o data class
fun main (){
    val joao = Funcionario("Joao", 2000.0)
    val pedro = Funcionario("Pedro", 1500.0)
    val maria = Funcionario("Maria", 4000.0)

    val funcionarios = listOf(joao, maria, pedro)

    //olhar funcionarios que estao dentro da lista de funcionarios
    funcionarios.forEach { println(it) } //o it aqui eh a instancia do objeto referenciado em cada variavel e alocado em uma lista
    println("--------------------------------")


    //encontrar um funcionario especifico
    println(funcionarios.find { it.nome == "Maria" })

    println("--------------------------------")
    // o it eh o objeto, e o objeto tem nome e salario. Fazendo o sorted(ordenar) pelo salario:
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) } //operacoes numa collection, finalizando todas as operacoes que estao sendo atreladas a colecao

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