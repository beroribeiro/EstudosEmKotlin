package me.ribei

fun main (){
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 2000.0
    salarios[2] = 3000.0

    salarios.forEach { println(it) }
    println("----------------------------------------")

    //fornece o indice onde esta na interacao; inteirando ou modificando o valor no indice corretamente
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1 //aumentando o salario em cada interacao
    }
    salarios.forEach { println(it) }
    println("----------------------------------------")

    //Outra forma de criar array de double, onde ja eh inincializando com o valor
    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
}