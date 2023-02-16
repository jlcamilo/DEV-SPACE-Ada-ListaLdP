//Utilizando o array acima, crie um algoritmo que imprima no console
//somente os numeros pares dentro desse array

fun main() {
    val numeros = arrayListOf<Int>()

    for (i in 0..6){
        numeros.add(i+1)
    }

    for(i in 0..numeros.lastIndex ) {
        if(numeros[i]%2 == 0){
            println(numeros[i])
        }

    }
}