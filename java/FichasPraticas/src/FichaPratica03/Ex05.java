package FichaPratica03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar variaveis e iniciar
        int num1, num2=1;
        String msg;
        //ler
        System.out.print("Introduz um numero: ");
        num1 = input.nextInt();

        //limpar o buffer
        input.nextLine();

        System.out.print("Introduz uma mensagem: ");
        msg = input.nextLine();

        while (num1 >= num2 && num2 <= num1) {
            System.out.println(msg);
            num2 = num2 + 1;
        }



//SOUT nextline apanha enter cuidado bufer e linhas
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
