package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
// Condição IF
        int idade = 10;
        boolean IsAutorizadoComprarBebida = idade >= 18;
        // !

        if (IsAutorizadoComprarBebida != false) {
            System.out.println("Autorizado a comprar bebida alcolica");

        }else {
            System.out.println("Não Autorizado");
        }

        // ou if (IsAutorizadoComprarBebida == false)
        if (!IsAutorizadoComprarBebida) ;
        {
            //(se ^ não)

            System.out.println("Não Autorizado");
        }



        boolean c = false;
        if (c == true) ;
        {
            System.out.println("Dentro do que nao e feito");
        }

        System.out.println("Fora do if");
    }
}
