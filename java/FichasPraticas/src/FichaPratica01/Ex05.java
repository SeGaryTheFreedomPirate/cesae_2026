package FichaPratica01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, resultado1, resultado2;
        System.out.println("Qual a nota 1?:");
        nota1 = input.nextInt();
        System.out.println("Qual a nota 2?:");
        nota2 = input.nextInt();
        System.out.println("Qual a nota 3?:");
        nota3 = input.nextInt();
        resultado1 = (nota1 + nota2 + nota3) / 3;
        resultado2 = nota1 * 0.20 + nota2 * 0.30 + nota3 * 0.50;
        System.out.println("A média aritmética é:" + resultado1);
        System.out.println("A média ponderada é:" + resultado2);
    }
}
