algoritmo "Aluguel de carro KM rodado e seus Dias alugado"
// Função :
// Autor :
// Data : 26/02/2024
// Seção de Declarações 
var
        Km,dia : real
        kmcorrido , diaalugado , total:real
        
inicio
        escreval ("Me informe o Km rodado pelo carro em questão: ")
        leia (km)
        escreval ("me informe quantos dias ele foi alugado: ")
        leia (dia)
        

           kmcorrido <- km*0.20
           diaalugado <- dia*90
           
           total <- kmcorrido+diaalugado

           
          escreval ("seu valor por km percorrido: ", kmcorrido)
          escreval ("Seu valor por dia será", diaalugado)
          

          escreval (" Valor total a ser pago é de: ",total)
           
// Seção de Comandos 
fimalgoritmo
