package FichaPratica02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("Qual a nota 1?: ");
        a = input.nextInt();
        System.out.print("Qual a nota 2?: ");
        b = input.nextInt();
        System.out.print("Qual a nota 3?: ");
        c = input.nextInt();

        if (a < b && a < c) {
            System.out.print("menor" + a);
        }
        if (b < a && b < c) {
            System.out.print("menor" + b);
        }
        if (c < a && c < b) {
            System.out.print("menor" + c);
        }


    }
}
