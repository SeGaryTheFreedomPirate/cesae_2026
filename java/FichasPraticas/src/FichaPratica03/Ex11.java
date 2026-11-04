package FichaPratica03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int salto,limite,numero=0;

        System.out.print("Introduz um Limite: ");
        limite = input.nextInt();
        System.out.print("Introduz um salto: ");
        salto = input.nextInt();


        while (numero<=limite) {
            System.out.println(numero);
            numero+=salto;

        }

        //LN
//systemoutprint ln esta a imprimir ara a frente sem o ln o LN E EXTREMAMAENTE IMPORTANTE
        //enquanto num1 for par imprime apenas os numeros pares ate ao nm1
//supoe que e maior que 2

//num % 2 == 0   == comparação se for igual ??

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
