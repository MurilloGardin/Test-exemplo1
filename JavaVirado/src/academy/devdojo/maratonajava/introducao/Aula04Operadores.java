package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
        public static void main(String[] args) {
            // + = / *
            int number01 = 10;
            double number02 = 20;
            double result = number01 / number02;

            System.out.println(result);

            // %
            int rest = 21 % 8;
            System.out.println(rest);

            // Operadores logicos [ < > <= >=  ==  !=] sempre retonam valores booleanos
            boolean isDezMaiorQueVinte = 10 >= 20;
            boolean isDezMenorQueVinte = 10 <= 20;
            boolean isDezIgualVinte = 10 == 20;
            boolean isDezIgualDez = 10 == 10;
            boolean isDezDiferenteDez = 10 != 10;

            System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
            System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
            System.out.println("isDezIgualVinte " + isDezIgualVinte);
            System.out.println("isDezIgualDez " + isDezIgualDez);
            System.out.println("isDezDiferenteDez " + isDezDiferenteDez);
// Operadores logicos
            // && (AND) ,  || (or) , ! logical not

            int date = 29;
            float salario = 3500F;
            // todas condições para retornar verdadeiro
            boolean isDentroDaLeiMaiorQueTrinta = date >= 30 && salario >= 4612;
            boolean isDentroDaLeiMenorQueTrinta = date < 30 && salario >= 3381;

            System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
            System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

            double valorTotalContaCorrente = 2000;
            double valorTotalContaPoupança = 3000;
            float valorPlaystation = 5000F;

            boolean IsPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupança > valorPlaystation
                    || valorTotalContaPoupança + valorTotalContaCorrente >= valorPlaystation;
            System.out.println("isPlaystationCompravel " + IsPlaystationCincoCompravel);


        /*
         Op. atribuição
          = += -+ *+ /+ %=
        */
            double bonus = 1800; // 1800
            bonus += 1000; // o bonus que recebeu mais 2000
            bonus -= 1200; // bonus - 1200
            bonus *= 2; // vezes bonus
            bonus /= 2; // vai dividir bonus
            bonus %= 2; //  resto do bonus

            System.out.println(bonus);

            int contador = 0;
            contador += 1; //  contador = contador + 1;
            contador++; // 2
            contador--; // 1
            ++contador; // 1
            --contador; // 0
            int contador2 = 0;
            System.out.println(contador2++); // INCREMENTAR DEPOIS
            System.out.println(++contador2); // INCREMENTA ANTES E DPOIS EXECUTA





        }
    }

