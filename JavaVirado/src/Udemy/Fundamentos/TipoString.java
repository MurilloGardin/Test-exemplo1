package Udemy.Fundamentos;

import javax.sound.midi.Soundbank;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 32;
        var salario = 12345.895;

        System.out.println("nome: " + nome + "\nSobrenome: " + sobrenome +
                "\nIdade: "+ idade + "\nSalario: " + salario + "\n\n");

        System.out.printf("O Senhor %s %s tem %d anos e ganha R$%.2f",
        nome,sobrenome,idade,salario);

        String frase = String.format("\n O Senhor %s %s tem %d anos e ganha R$%.2f",
                nome,sobrenome,idade,salario);
        System.out.println(frase);
    }

}
