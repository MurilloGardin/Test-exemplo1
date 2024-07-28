algoritmo "ESCOLHA"
// Função :
// Autor :
// Data : 27/02/2024
// Seção de Declarações 
var
       D : inteiro
       valor : real
inicio

Escreval ("------------------------------")
escreval ("     CRIANÇA ESPERANÇA        ")
escreval ("------------------------------")

escreval ("Sinta-se a vontade em ajudar na doação ")
escreval (" [1] para doar R$10")
escreval (" [2] para doar R$25  ")
escreval (" [3] para doar R$50 ")
escreval (" [4] para doar outros valores ")
escreval (" [5] para cancelar ")
leia (D)

escolha D
  Caso  1
  valor <- 10
  
  
  Caso  2
  valor <- 25
  
  
  Caso  3
     valor <- 50
     
  
  Caso  4
        escreva ("Qual valor será de sua doação?: ")
        leia (valor)
        

  Caso  5
  
  valor  <-0
  fimescolha
  
       Escreval ("----------------------------")
       Escreval ("   SUA DOAÇãO FOI DE  R$",valor)
       escreval ("   MUITO OBRIGADO !!!")
       escreval ("----------------------------")
       
       
       
  
  



// Seção de Comandos 
fimalgoritmo
