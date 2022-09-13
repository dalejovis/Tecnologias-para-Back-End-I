package aula0830;

import java.util.Arrays;
import java.util.Scanner;

public class ArmazenaNomeDeAlunos {
    public static void main(String[] args) {

        String [] listaDeNomes = new String [7];
        Scanner scanner = new Scanner(System.in);

        listaDeNomes[0] = "João";
        listaDeNomes[1] = "Maria";
        listaDeNomes[2] = "José";
        listaDeNomes[3] = "Rebeca";
        listaDeNomes[4] = "Vitor";
        listaDeNomes[5] = "Julia";
        listaDeNomes[6] = "Mario";

        System.out.println(Arrays.toString(listaDeNomes));

        for (int i = 0; i < listaDeNomes.length; i++){
            System.out.println(listaDeNomes[i]);
        }

        int contador = 10;

        while (contador < 20){
            System.out.println(contador + " ainda é menor que 20.");
            contador++;
        }

    }
}
