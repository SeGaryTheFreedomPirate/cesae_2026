package FichaPratica02;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int valor, notas;

        // Ler valores
        System.out.print("Valor a levantar: ");
        valor = input.nextInt();

        if (valor % 5 == 0) {
            // Apresentar notas
            notas = valor / 200;
            System.out.println("Notas de 200€: " + notas);
            valor = valor % 200;

            notas = valor / 100;
            System.out.println("Notas de 100€: " + notas);
            valor = valor % 100;

            notas = valor / 50;
            System.out.println("Notas de  50€: " + notas);
            valor = valor % 50;

            notas = valor / 20;
            System.out.println("Notas de  20€: " + notas);
            valor = valor % 20;

            notas = valor / 10;
            System.out.println("Notas de  10€: " + notas);
            valor = valor % 10;

            notas = valor / 5;
            System.out.println("Notas de   5€: " + notas);
        }else{
            System.out.println("Não damos trocos :D");
        }



    }
}
//   // // //declarar ou iniciar as variaveis
//        //        int num1, num2, resultado;
//        //        String = A TEXTOS;
//        //        //ler valores de input
//        // PENSAR 1º SEMPRE NO ALGORITMO
//        //SWICTH CASE É SEMPRE NO CASO DE SER UM CASO ==
//        //IF IF IF ELSE
/// /o que é um string e quando se usa em relação a ints e doubles ??