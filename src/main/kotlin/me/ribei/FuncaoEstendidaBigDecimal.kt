package me.ribei

import java.math.BigDecimal

//Usando a funcao estendida chamada somatoria para um array do tipo bigdecimal
//Ela vai reduzir a somatoria de tudo que esta ali no valor
fun Array <BigDecimal>.somatoria() = this.reduce { acc, valor -> acc + valor  }

//mais uma funcao estendida que se chama media.
// Se o Array tiver vazio, a media eh zero, caso nao, ele devolve a somatoria e divide pelo tamanho do array
fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()