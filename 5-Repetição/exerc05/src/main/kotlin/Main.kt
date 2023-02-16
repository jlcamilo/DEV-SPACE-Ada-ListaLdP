//Crie um algoritmo que imprima no console a tabuada do 0 ao 10 sem
//reptir varias vezes o mesmo fluxo
fun main() {
    println("Tabuada do 0 ao 10")
    for (i in 0..10){
        println("Tabuada do $i")
        for(j in 0..10){
            println("$i x $j: "+(i*j))
        }
    }
}