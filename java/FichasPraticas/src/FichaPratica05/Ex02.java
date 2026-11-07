package FichaPratica05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] vetor = new double[12];
        double total=0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira a comissão: [" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) { //ele volta a correr mas apenas só a soma
            total= total + vetor[i];
        }

        System.out.print("Total de comissões:" + total);

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