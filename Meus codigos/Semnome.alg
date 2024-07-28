algoritmo "SALARIO"
// Função :
// Autor :
// Data : 27/02/2024
// Seção de Declarações 
var
     nome :caractere
      sal, Nsal :real
      dep :inteiro
      
inicio

      Escreval (" QUAL NOME DO FUNCIONARIO??")
      leia (nome)
      escreval (" QUAL SALARIO DO FUNCIONARIO??")
      leia (sal)
      Escreva ("QUANTOS DEPENDETES ELE TEM??")
      leia (dep)
      
      escolha
          caso 0
              Nsal <- sal + (sal*5/100)
         caso 1 , 2 , 3
              Nsal <- sal + (sal*10/100)
         caso 4, 5 ,6
              Nsal <- sal + (sal*15/100)
         caso
              Nsal <- sal + (sal*20/100)
              fimescolha
              
              Escreval (" O novo salario de seu funcionario",nome," passara a ser de",
              sal," para:", Nsal)


      
// Seção de Comandos 
fimalgoritmo
