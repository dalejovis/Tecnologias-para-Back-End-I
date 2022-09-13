package aula0823;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        double nota1 = ler.nextDouble();

        System.out.print("Digite sua segunda nota: ");
        double nota2 = ler.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Sua média foi " + media);
    }
}
