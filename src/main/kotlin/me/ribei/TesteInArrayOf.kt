package me.ribei

fun main () {
    val values = intArrayOf(2, 3, 4, 1, 10, 7) //iniciar um array e passar as referencias, adiciona de forma mais flexivel na instanciacao

    values.forEach {
        println(it)
    }
    println("-----------------------------------------")

    //ordenando os valores
    values.sort()
    values.forEach {
        println(it)
    }
}