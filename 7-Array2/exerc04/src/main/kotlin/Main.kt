//Utilizando o exercicio acima, crie um algoritmo do tipo Int sem ordem, crie
//uma função que receba esse algoritmo com parametro e devolve os itens na
//ordem correta, mas dessa vez sem utilizar a função sort do kotlin.Imprima
// no console os valores ordenados

fun ordena(numeros: ArrayList<Int>): ArrayList<Int> {

    for(i in 0..numeros.lastIndex){
        for (j in 1..numeros.lastIndex){
            if (numeros[j-1] > numeros[j]){
                val troca = numeros[j-1]
                numeros[j-1] = numeros[j]
                numeros[j] = troca
            }
        }
    }
    return numeros
}

fun main() {
    val numeros = arrayListOf<Int>(8,6,4,9,1,2,3,0,7,5)

    ordena(numeros)

    numeros.forEach{numero ->
        println(numero)
    }

}