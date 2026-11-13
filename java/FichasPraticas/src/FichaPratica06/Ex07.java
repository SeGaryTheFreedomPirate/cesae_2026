package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Library.imprimirquadrado;

public class Ex07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limitelinhas, limitecolunas;
        System.out.println("Introduza um caracter: ");
        String car = input.next();
        System.out.println("Introduza número de linhas: ");
        limitelinhas=input.nextInt();
        System.out.println("Introduza número de colunas: ");
        limitecolunas=input.nextInt();

        imprimirquadrado(limitelinhas,limitecolunas,car);

    }
}
