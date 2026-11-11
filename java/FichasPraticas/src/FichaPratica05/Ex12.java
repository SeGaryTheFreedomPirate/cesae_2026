package FichaPratica05;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for (int linha = 0; linha < array1.length; linha++) {
            System.out.print("Insira no vetor 1[" + linha + "]");
            array1[linha] = input.nextInt();
        }
        System.out.println("-------------------------");

        for (int linha = 0; linha < array2.length; linha++) {
            System.out.print("Insira no vetor 2[" + linha + "]");
            array2[linha] = input.nextInt();
        }

        System.out.println("-------------------------");


        int[][] matriz = new int[10][2];

        for (int i = 0; i < matriz.length; i++) {
            matriz[i][0] = array1[i]; // Coluna 0 fica com o elemento do Array1
            matriz[i][1] = array2[i]; // Coluna 1 fica com o elemento do Array2
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][0] + " " + matriz[i][1]);
        }


    }
    //separar os ciclos de leitura e de impressão
//IMPRIMIR 100 ENTERS NA CONSOLA
//for (;num <= 100 && num >= 0)
//if (num <= 100 && num >= 0)
// SWICTH CASE SO PARA IGUALDADES NAO DA PARA USAR NUNCA MAIORES E MENORES
//COMAND OPTION L
//CUIDADO COM LN IMPRESSÃO COM ENTER OU SEM ""
//num % 2 == 0 == comparação se for igual ??
//ler // criar e iniciar
// imprimir na consola
// numero ++; numero++;++numero;numero--;numero+=2;numero%=3
// tempo=numero; = soma=num1+ soma+1;
//SOUT
//EQUALS CUIDADO PARA STRINGS
// PENSAR 1º SEMPRE NO ALGORITMO
//SWICTH CASE É SEMPRE NO CASO DE SER UM CASO COMPARATIVO ==
//IF IF IF ELSE

}



