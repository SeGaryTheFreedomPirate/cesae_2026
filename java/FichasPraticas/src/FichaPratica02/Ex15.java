package FichaPratica02;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        String ordem;
        System.out.println("Introduza N 1:");
        a = input.nextInt();
        System.out.println("Introduza N 2: ");
        b = input.nextInt();
        System.out.println("Introduza N 3: ");
        c = input.nextInt();

        System.out.println("Crescente ou decrescente?");
        ordem = input.next();

        switch (ordem) {
            case "C":
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
                break;

            case "D":
                if (a < b && a < c) {
                    if (b < c) {
                        System.out.println(c + " " + b + " " + a);
                    } else {
                        System.out.println(b + " " + c + " " + a);
                    }
                }

                if (b < a && b < c) {
                    if (a < c) {
                        System.out.println(c + " " + a + " " + b);
                    } else {
                        System.out.println(a + " " + c + " " + b);
                    }
                }

                if (c < a && c < b) {
                    if (a < b) {
                        System.out.println(a + " " + b + " " + c);
                    } else {
                    }
                    System.out.println(b + " " + a + " " + c);
                }
                break;
            default:
                System.out.println("Operação invalida");
        }
        }
    }