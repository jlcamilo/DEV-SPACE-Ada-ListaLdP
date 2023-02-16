//Crie um algoritmo que faça a declaração de um array do tipo Int com números
//sem ordem. por exemplo:0, 4, 5, 1, 3, 2. Utilizando a função sort do kotlin
//e fluxo de repetição para percorrer esse array, imprime no console os valores
//em ordem sequencial, por exemplo: 0, 1, 2, 3, 4, 5.
fun main() {
    val numeros = arrayListOf<Int>(8,6,4,9,1,2,3,0,7,5)

    numeros.sort()
    numeros.forEach{numero ->
        println(numero)
    }

}