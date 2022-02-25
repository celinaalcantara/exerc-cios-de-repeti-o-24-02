fun main(){

    //Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

    var nPar = 0
    var nImpar = 0

    for (i in 1..10){
        print("Digite o ${i}° número: ")
        var num = readLine()!!.toInt()

        if (num % 2 == 0){
            nPar++

        }else{
            nImpar++
        }
    }

    println("Aquantidade de números pares foi de $nPar e a quantidade de números ímpares foi de $nImpar")

}