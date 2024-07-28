package Udemy.Fundamentos;

public class Test01 {
    public static void main(String[] args) {

        // Estrutura do metodo MAIN é o ponto de entada em java
        // (ºF - 32) x 5/9 = ºC
        final double FATOR = 5.0 / 9.0;
        final double AJUSTE = 32;

        double fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE) * FATOR;

        System.out.println("Seu valor em ºC é "+ celsius );


        fahrenheit = 150;
        celsius = (fahrenheit - AJUSTE) * FATOR;

        System.out.println(" Seu valor em ºC é " + celsius);



      /**
       *  double F = 86;
        double C = (F - 32) * 5/9;
        System.out.println("Seu valor em ºC é "+ C );

         F = 150;
         C = (F - 32) * 5/9;
        System.out.println("Seu valor em ºC é "+ C );

       nao é que esteja errado porem nao consigo mudar a frente do codigo
       **/




    }

}
