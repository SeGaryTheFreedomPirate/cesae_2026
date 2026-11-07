package FichaPratica05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];

        // Leitura dos valores
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("___________________________________");

        // Impressão dos valores
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor[" + i + "]: " + vetor[i]);
        }
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