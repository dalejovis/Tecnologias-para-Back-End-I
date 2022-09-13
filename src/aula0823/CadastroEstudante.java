package aula0823;

import java.util.Scanner;

public class CadastroEstudante {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome, endereco, curso;
        int idade;

        System.out.print("Nome do Estudante: ");
        nome = ler.nextLine();

        System.out.print("Endereço: ");
        endereco = ler.nextLine();

        System.out.print("Curso: ");
        curso = ler.nextLine();

        System.out.print("Idade: ");
        idade = ler.nextInt();

        if (idade < 18){
            System.out.println("Por favor, se dirigir a secretaria e preencher declaração com a assinatura do responsável.");
        }
        else {
            System.out.println("Estudante cadastrado com sucesso!");
        }
    }
}
