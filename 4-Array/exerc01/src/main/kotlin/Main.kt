//Crie um algoritmo que faz a declaração de um array do tipo String,
//adicione 4 itens e imprima no console e "size" tamanho do array
fun main() {
    val text = arrayListOf<String>("DEV SPACE","Kotlin","Android","DO ZERO AO DEV")

    println("Tamanho do Array: "+text.size)

    for(i in 0..text.lastIndex){
        println(text[i])
    }

}