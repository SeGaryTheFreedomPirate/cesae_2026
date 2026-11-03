package FichaPratica03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 =0, media, soma=1,vezes=-1;

        while (num1!= -1) {
            System.out.print("Introduz um numero: ");
            num1 = input.nextInt();
            soma=soma+num1;
            vezes++;
        }
media=soma/vezes;

        System.out.print("Media: " + media);
//ler // criar e iniciar
// imprimir na consola
        // as chavetas bloquarm o valor numero ++; numero++;++numero;numero--;numero+=2;numero%=3
// tempo=numero; = soma=num1+ soma +1;
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
