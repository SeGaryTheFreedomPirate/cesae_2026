package FichaPratica04;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, aposta, contador = 0, resultado = 0;

        System.out.println("Qual o numero do jogador?: ");
        num = input.nextInt();

        do {
            System.out.println("Qual a tua aposta? ");
            aposta = input.nextInt();   // SWICTH CASE SO PARA IGUALDADES NAO DA PARA USAR NUNCA MAIORES E MENORES //


            switch (aposta) {

                case aposta = num:
                    System.out.println("Certo");
                    break;

                case aposta < num:
                    System.out.println("A tua aposta é mais baixa que o meu numero");
                    break;

                case aposta > num:
                    System.out.println("A tua aposta é mais alta que o meu numero");
                    break;

                default:
                    (num <= 0 || num >= 100);
                    System.out.println("Operação inválida: ");
                    break;
            }
            System.out.println("Nova Tentativa");
            aposta = input.next();
        } while (aposta != num);
    }

}
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