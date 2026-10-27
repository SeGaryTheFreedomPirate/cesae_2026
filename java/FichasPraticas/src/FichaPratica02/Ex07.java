package FichaPratica02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int num1;
        // Leitura dos valores
        System.out.print("Introduza um numero: ");
        num1 = input.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("É par");
        } else {
            System.out.println("É impar");
        }
    }
}
