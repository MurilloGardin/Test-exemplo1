algoritmo "Teste de IMC"
// Função :
// Autor :
// Data : 27/02/2024
// Seção de Declarações 
var
Peso  , altura, IMC :real

inicio

      escreval ("---------------------")
      escreval ("     TESTE DE IMC    ")
      Escreval ("---------------------")
      
      Escreva (" Informe seu peso (Kg) : ")
      leia(Peso)
      escreva (" Informe sua altura (m) : ")
      leia (altura)
      
      IMC <- peso/ altura^2
      escreval ("----------------------------")
      escreval (" Seu IMC é de : ", IMC:5:2)
      escreval ("----------------------------")

      SE (IMC >= 18.5) e (IMC <= 25 ) entao
         escreval(" PARABENS VOCÊ ESTA NO SEU PESO IDEAL!!!")
          senao
            se (IMC <= 17) entao
            escreva (" VOCE ESTA MUITO ABAIXO DO PESO!! O.O")
            senao
                 se ( IMC >=17) e (IMC <=18.5) entao
                 escreva (" VOCE ESTA ABAIXO DO PESO EM!!")
             senao
                  se (IMC >=25) e (IMC <=30) entao
                  escreval("VOCÊ ESTA COM SOBREPESO, MAS NAO È O FIM!")
                  senao
                       se (IMC >=30) e (IMC <=35) entao
                       escreval(" CARACA VOCE ESTA CO OBESIDADE")
                       senao
                            se (IMC >=35) e (IMC <=40) entao
                            escreva (" VOCÊ ESTA COM OBESIDADE SEVERA EM< CUIDADOO!!")
                            senao
                                 escreva("MANO SE JA MORREU É OBESIDADE Móbida!!!")
                                 
    fimse
   fimse
  fimse
 fimse
fimse
             
             
             
             
             
      

      
      
// Seção de Comandos 
fimalgoritmo

