package FichaPratica01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area, raio, pi;
        System.out.println("Qual o raio da circunferência?:");
        raio = input.nextDouble();
        pi = 3.14;
        area = pi * raio * raio;
        System.out.print("A área é:" + area);


    }
}
//a= pi*r2