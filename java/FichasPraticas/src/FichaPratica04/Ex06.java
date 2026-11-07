package FichaPratica04;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numeroSecreto, palpite, contadorTentativas = 0;

        // Ler numero do JOGADOR 1
        System.out.print("[JOGADOR 1] Insira o número secreto (0-100): ");
        numeroSecreto = input.nextInt();

        // "Limpar a consola"
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }

        do {

            // Palpite JOGADOR 2
            System.out.print("\n[JOGADOR 2] Tenta acertar no número secreto: ");
            palpite = input.nextInt();

            contadorTentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("O teu palpite foi muito baixo. Tenta subir um pouco.");
            } else if (palpite > numeroSecreto) {
                System.out.println("O teu palpite foi muito alto. Tenta baixar um pouco.");
            }

        } while (palpite != numeroSecreto);

        System.out.println("\n\nGANHASTE! Acertaste no número secreto: " + numeroSecreto);
        System.out.println("Foram necessárias "+contadorTentativas+" tentativas!");

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