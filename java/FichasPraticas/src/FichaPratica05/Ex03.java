package FichaPratica05;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];

        int num;
        for (int i = 0; i < vetor.length; i++) {//ele volta a correr mas apenas só a soma
            System.out.print("Qual o numero: [" + i + "]: ");
            vetor[i] = input.nextInt();
        }
        num = vetor[0];
        for (int i = 0; i < vetor.length; i++) {   //ele volta a correr mas apenas só a soma
            if (vetor[i]>num) {num= vetor[i];}
        }
        System.out.print("o numero maior é:" + num);
    }
}

