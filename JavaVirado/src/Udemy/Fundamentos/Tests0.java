package Udemy.Fundamentos;

// CRLT + ALT +L  =  formata os codigos para deixa menos poluido
public class Tests0 {
    public static void main(String[] args) {
        double raio = 3.4; // valor real
        final double PI = 3.14159; // final nao muda o valor de pi

        double area = PI * raio * raio;
        // System.out.println(); // imprima uma linha na saido do sistema
        System.out.println(area);

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Área = " + area + " m2.");

    }

}
