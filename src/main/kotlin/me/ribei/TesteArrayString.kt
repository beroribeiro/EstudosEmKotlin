package me.ribei

fun main (){
    //criacao de um Array incializado com um tipico especifico
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Bruno"
    nomes[2] = "Jose"

    for (nome in nomes){
        println(nome)
    }
    println("--------------------")

    nomes.sort()
    nomes.forEach {
        println(it)
    }
    println("--------------------")

    //declarando de outra forma
    val nomes2 = arrayOf("Maria", "Bruno", "Jose")
    nomes2.sort()
    nomes2.forEach { println(it) }

}