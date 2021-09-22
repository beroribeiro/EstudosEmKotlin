package me.ribei

fun main () {
    val values = IntArray(5)

    //instancia inicializada com os valores/inteirar
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2


    //ver os valores, a variavel em cada interacao/enquanto existir
    for (valor in values){
        println(valor)
    }
    println("---------------------------------------------")

    //a cada interacao, a variavel valor dentro do escopo tem um it - faz o papel da variavel valor
    values.forEach { valor ->
        println(valor) //ou println(it)
    }
    println("---------------------------------------------")


    //inteirar sobre os indices do Array, nao esta inteirando sobre os valores propriamente ditos
    for (index in values.indices){
        println(values[index]) //passar o array em si e o indice para trazer o valor que esta na posicao especifica
    }
    println("---------------------------------------------")


    //Recurso que ordena os valores do menor para o maior
    values.sort()
    for (valor in values){
        println(valor)
    }
}
