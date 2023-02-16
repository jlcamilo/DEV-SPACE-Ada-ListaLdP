//Cria uma função que faça o calculo do IMC recebendo dois parametros
//peso e altura e retorne o valor Float do resultado

fun imc(peso:Float,altura:Float):Float{
    return peso/(altura*altura)
}

fun main() {
    val peso = 83f
    val altura = 1.83f

    println(imc(peso,altura))
}