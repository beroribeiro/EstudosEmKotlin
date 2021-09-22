package me.ribei

fun main (){
    val salarios = doubleArrayOf(1000.0,2250.0, 4000.0)

    for (salario in salarios){
        println(salario)
    }
    println("--------------------------------------------")

    //Ordenando o maior, menor e a media dos salarios
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    println("--------------------------------------------")

    //buscando salarios maiores que 2500; passar um predicado pro filter, sendo a expressao verdade, ele vai filtrando a Array - alocando em outra colecao como resultado
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    salariosMaiorQue2500.forEach { println(it) }
    println("--------------------------------------------")

    //saber a quantidade,elementos de salarios em um intervalo/ expressao aplicada a um valor do array, se for verdadeira, vai adiconar/contar como verdade
    println(salarios.count{ it in 2000.0..5000.0})
    println("--------------------------------------------")

    //buscando o elemento/ o valor exato ou nao
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })
    println("--------------------------------------------")

    //encontrar na colecao um elemento onde a(deixa) expressao seja valida/verdadeira
    println(salarios.any { it == 2250.0 })
    println(salarios.any { it == 500.0 })

}