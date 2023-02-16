//Utilizando o algoritmo acima com operadores lógicos, imprima no console
//"Aprovado" caso a média seja acima de 7 ou "Reprovado" se for abaixo

fun main() {
    val nota1:Float = 5f
    val nota2:Float = 9f
    val nota3:Float = 4f

    val media:Float = (nota1+nota2+nota3)/3

    if (media >= 7){
        println("Aprovado!")
    }else{
        println("Reprovado!")
    }

    println("Media = "+media)
}