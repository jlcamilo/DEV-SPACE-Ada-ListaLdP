//Crie um algoritmo que faz a declaração de uma variavel do tipo Int
// e imprima no console a seguinte mensagem de acoro com cada valor
fun main() {
    val idade:Int = 17

    if (idade < 12 ){
        println("Criança")
    }else if (idade in 12..17){
        println("Adolescente")
    }else if (idade >= 18){
        println("Adulto")
    }
}