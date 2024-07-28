package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500tao";
        String MensagemNaoDoar = "Ainda não Tenho condições, Mas vou ter";
       // (condição) ? verdadeiro : falso;
        // Operadores ternarios
        String resultado = salario > 5000 ? mensagemDoar : MensagemNaoDoar;

        System.out.println(resultado);

       /*  seria essa a expressão no modo anterior
       if (salario >= 6000){
            System.out.println(mensagemDoar);
        }else{
            System.out.println(MensagemNaoDoar);
        }
    }*/
    }
}
