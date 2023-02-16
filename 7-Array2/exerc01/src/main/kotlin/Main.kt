//Crie um algoritmo que faça a declaração de um array do tipo Int
//e adicione 7 itens no array utilizando o fluxo de repetição
fun main() {
    val numeros = arrayListOf<Int>()

    for (i in 0..6){
        numeros.add(i+1)
    }

    for(i in 0..numeros.lastIndex ) {
        println(numeros[i])
    }
}