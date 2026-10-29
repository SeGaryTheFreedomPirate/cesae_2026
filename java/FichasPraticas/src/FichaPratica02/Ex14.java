package FichaPratica02;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        System.out.println("Introduza N 1:");
        a = input.nextInt();
        System.out.println("Introduza N 2: ");
        b = input.nextInt();
        System.out.println("Introduza N 3: ");
        c = input.nextInt();

        if (a < b && a < c) {
            if (b < c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        }

        if (b < a && b < c) {
            if (a < c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        }

        if (c < a && c < b) {
            if (a < b) {
                System.out.println(c + " " + b + " " + a);
            } else {
                System.out.println(c + " " + a + " " + b);
            }
        }


//ABC // ACB // BAC BCA CAB CBA SE FOREM IGUAIS ??


    }
}
