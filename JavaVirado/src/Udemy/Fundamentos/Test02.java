package Udemy.Fundamentos;

public class Test02 {
// Inferencias
    public static void main(String[] args) {

        double a = 4.5; // declarei e inicializei
        // valores Decimais conseguem receber valores Inteiros
        System.out.println(a);

        a = 12;
        System.out.println(a);

        var b = 4.5; // o var identifica auto.  qual tipo de vareavel
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro texto";
        System.out.println(c);

        double d; // variavel foi declarada
        d = 123.65; // variavel foi inicializada
        System.out.println(d); // usada;

        var e = 123.45;
        /* var e;
        e = 123    isso nao pode ser feito com var */
        System.out.println(e);

        var f = 12; // inteiro
        // f = 12.01; (  nao funciona de int ao contrario da a )


    }

}
