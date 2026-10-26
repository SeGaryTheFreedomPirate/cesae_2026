package FichaPratica01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double preço1, preço2, preço3, total;
        System.out.println("Qual o preço 1?:");
        preço1 = input.nextDouble();
        System.out.println("Qual o preço 2?:");
        preço2 = input.nextDouble();
        System.out.println("Qual o preço 3?:");
        preço3 = input.nextDouble();
        total = (preço1 + preço2 + preço3)*0.90;
        System.out.println("Total:"+total+"€");
    }
}
