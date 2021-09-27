package me.ribei


fun main (){
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    //alocando em dois conjuntos
    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    //uniao do conjunto 1 com o conjunto 2
    val resultadoUniao = funcionarios1.union(funcionarios2)
    resultadoUniao.forEach { println(it) }

    println("-------------------------------------")

    //criando um conjunto com todos os funcionarios e removendo um deles
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultadoSubtracao = funcionarios3.subtract(funcionarios2)
    resultadoSubtracao.forEach { println(it) }

    println("-------------------------------------")

   //intersectar
    val resultadoIntersect = funcionarios3.intersect(funcionarios2)
    resultadoIntersect.forEach { println(it) }


    }
