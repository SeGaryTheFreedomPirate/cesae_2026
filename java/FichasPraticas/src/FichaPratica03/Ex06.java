package FichaPratica03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar variaveis e iniciar
        int num1, num2 = 1;

        //ler
        System.out.print("Introduz um numero de incio: ");
        num1 = input.nextInt();
        System.out.print("Introduz um numero de fim: ");
        num2 = input.nextInt();

        while (num1<=num2) {
            System.out.println(num1);
            num1 = num1 + 1;
        }


        //////   // // //declarar ou iniciar as variaveis
        //SOUT
        //////        //        int num1, num2, resultado;
        //////        //        String = A TEXTOS;
        //////        //        //ler valores de input
        //////        // PENSAR 1º SEMPRE NO ALGORITMO
        //////        //SWICTH CASE É SEMPRE NO CASO DE SER UM CASO ==
        //////        //IF IF IF ELSE
        /////// /o que é um string e quando se usa em relação a ints e doubles ??
    }
}
