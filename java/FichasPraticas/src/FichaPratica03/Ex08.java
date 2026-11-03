package FichaPratica03;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1,anterior,sucessor;


        System.out.print("Introduz um numero: ");
        num1 = input.nextInt();
        anterior= num1-5;
        sucessor =num1 + 5;


        while (anterior < num1) {
            System.out.println(anterior);
            anterior = anterior + 1;

        }

num1++;
        while (num1<= sucessor) {
            System.out.println(num1);
           num1++;

        }




//Declarar variaveis e iniciar
        //ler




        //= serve para abrir a gaveta //true false logica se verdadeiro
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
