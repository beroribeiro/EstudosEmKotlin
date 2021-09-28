package me.ribei

class Repositorio<T> {
    //Mapa mutavel - vai sofrer mutacao. Uma vez instanciado o repositorio, o mapa eh criado/ja instanciado
    //Dar create - vai alterar o mapa, adicionar
    private val map = mutableMapOf<String, T>()

    // T eh o generics
    fun create(id: String, value: T){
        map[id] = value
    }

    fun remove(id: String) = map.remove(id)


    fun findById(id: String) = map[id]
    //mapa chave - valor.

    //o mapa tem elementos dentnro, para pegar a colecao de elementos que tem dentro do mapa = values
    fun findAll() = map.values
    }

