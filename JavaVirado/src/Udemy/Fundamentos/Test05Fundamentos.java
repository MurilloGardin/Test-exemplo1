package Udemy.Fundamentos;

public class Test05Fundamentos {
    public static void main(String[] args) {


        double a = 2.3;
        String s = "Bom dia X";
        s = s.replace("X" , "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        String x = "Murillo".toUpperCase(); // fazendo todas as letras ficarem maiúcula
        System.out.println(x);

        String y = "Bom Dia X"
                .replace("X", "Gui")  // Repassando todos os X em um nome
                .toUpperCase()
                .concat("!!!"); // colocando no final da string algo escrito
        System.out.println(y);

        // Tipos Primitivos não tem o operador "."
        int j =3;

        System.out.println(j);

        
    }
}
