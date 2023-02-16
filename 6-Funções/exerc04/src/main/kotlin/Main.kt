// Utilizando o algoritmo acima, crie uma função que receba o resultado do
//calculo do IMC como parametro e retorne sua classificação como String,
//imprime no console o valor da classificação

fun imc(peso:Float,altura:Float):Float{
    return peso/(altura*altura)
}

fun imcClassificacao(imc:Float):String{

    val text = if (imc < 18.5f){
        "MAGREZA"
    }else if (imc in 18.5f..24.999f){
        "NORMAL"
    }else if (imc in 25.0f..29.999f){
        "SOBREPESO"
    }else if (imc in 30.0f..39.999f){
        "OBESIDADE"
    }else {
        "OBESIDADE GRAVE"
    }

    return text
}

fun main() {
    val peso = 83f
    val altura = 1.83f

    //println(imc(peso,altura))
    println(imcClassificacao(imc(peso,altura)))
}