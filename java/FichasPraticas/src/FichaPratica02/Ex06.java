package FichaPratica02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        double num1 = 0, num2 = 0;
        // Leitura dos valores
        System.out.print("Introduza um numero: ");
        num1 = input.nextDouble();
        System.out.print("Introduza um numero: ");
        num2 = input.nextDouble();

        if (num1 > num2) {
            System.out.println(num1+" "+ num2);
        } else {
            System.out.println(num2+" "+ num1);
        }


    }
}