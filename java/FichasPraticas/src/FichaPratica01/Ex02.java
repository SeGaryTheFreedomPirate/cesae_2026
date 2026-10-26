package FichaPratica01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.print("Introduza um número:");
        double num1=input.nextInt();
        System.out.print("Introduza outro número:");
        double num2=input.nextInt();
        double soma,subtração,multiplicação,divisão;
        soma=num1+num2;
        subtração=num1-num2;
        multiplicação=num1*num2;
        divisão=num1/num2;
        System.out.println("Soma:"+soma);
        System.out.println("Subtração:"+subtração);
        System.out.println("Multiplicação:"+multiplicação);
        System.out.println("Divisão:"+divisão);



    }
}
