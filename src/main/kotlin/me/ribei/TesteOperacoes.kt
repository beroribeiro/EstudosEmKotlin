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
}