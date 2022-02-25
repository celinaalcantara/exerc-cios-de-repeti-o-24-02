import java.sql.DriverManager.println

fun main (){
    /* Uma empresa desenvolveu uma pesquisa para saber as características psicológicas
     dos indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado:
     idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa
     era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se
     para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
     o número de pessoas calmas;
     o número de mulheres nervosas;
     o número de homens agressivos;
     o número de outros calmos;
     o número de pessoas nervosas com mais de 40 anos;
     o número de pessoas calmas com menos de 18 anos.
 */
    var idade = 0
    var sexo = 0
    var opcao = 0
    var cont = 0

    var mNerv = 0
    var hAgr = 0
    var oCalm = 0
    var pnAcima40 = 0
    var pcAbaixo18 = 0

    while (cont < 1){

        println("Pessoa ${cont+1}")

        println("Digite a idade: ")
        idade = readLine()!!.toInt()

        println("Digite o sexo, 1 para feminino, 2 para masculino e 3 para outros: ")
        sexo = readLine()!!.toInt()

        println("Digite seu sexo, 1 para feminino, 2 para masculino e 3 para outros: ")
        opcao = readLine()!!.toInt()

        cont++

    }
    if(sexo == 1 && opcao ==2){
        mNerv++

    }
    if(sexo == 2 && opcao ==3){
        hAgr++

    }
    if(sexo == 3 && opcao ==1){
        oCalm++

    }
    if(opcao == 2 && idade > 40){
        pnAcima40++
    }

    if(idade < 18 && opcao == 1){
        pcAbaixo18++
    }

    cont++

}