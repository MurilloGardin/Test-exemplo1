algoritmo "Contagem"
// Função :
// Autor :
// Data : 04/03/2024
// Seção de Declarações 
var
       cont , n , s, maior, menor : inteiro
inicio

       cont <- 1
       s <- 0
       maior <- 0 // Inicializa o maior com um valor que garante a correta comparação
       menor <- 9999 // Inicializa o menor com um valor muito grande para garantir
       enquanto ( cont <= 5)  faca
            escreval ("Digite o",cont,"º número da soma")
            leia (n)
               se (n > maior) entao
               maior <- n
                  fimse

               se (n < menor) entao
               menor <- n
                  fimse

            s <- s + n
            cont <- cont + 1
       fimenquanto
            escreval (" A soma de todos os número digitados é: ",s)
            Escreval (" Seu maior número digitado foi: ",maior)
            Escreval (" Seu menor número digitado foi: ",menor)

        
        
// Seção de Comandos 
fimalgoritmo
