package FichaPratica04;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero;
        boolean primo = true;

        // Ler valores
        System.out.print("Insira um número: ");
        numero = input.nextInt();

        for (int divisor = 2; divisor < numero; divisor++) {

            if (numero % divisor == 0) {
                // Encontrou um divisor - não é primo
                primo = false;
            }
        }

        if (primo) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
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