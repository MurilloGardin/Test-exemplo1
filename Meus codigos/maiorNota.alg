algoritmo    "MelhorNOTA"

var
        QAL , cont : inteiro
        nome,melhorAluno : caractere
        nota, maiorNota: real


inicio
      Escreval ("-----------------------")
      Escreval ("  ESCOLA ESTADUAL UAL  ")
      Escreval ("-----------------------")
      Escreva (" Quantos alonos a turma tem?")
      leia (QAL)
      cont <- 1
      Enquanto ( cont <= QAL) faca
               Escreval("-------------")
               Escreval("ALUNO", cont)
               Escreval("Nome do ALuno:")
               leia(nome)
               Escreva("Nota de ",nome, " Foi quanto: ")
               leia(nota)
               Se ( nota > maiornota) entao
                   maiorNota <- nota
                   melhorAluno <- nome
               fimse
               cont <- cont + 1
      fimenquanto
      Escreval ("------------")
      Escreval("O melhor aproveitamento foi de ", melhorAluno, " com a nota ", maiorNota:3:1)
fimalgoritmo
