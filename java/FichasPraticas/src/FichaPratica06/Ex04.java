package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex03.*;

public class Ex04 {
    /**
     * impressão de menu
     */
    public static void imprimirMenu() {
        System.out.println("\n-+-+-+-+-+-+- Programa de Analisar Números -+-+-+-+-+-+-");
        System.out.println("1. Par ou Impar");
        System.out.println("2. Positivo ou Negativo");
        System.out.println("3. Primo");
        System.out.println("4. Perfeito");
        System.out.println("5. Triangular");
        System.out.println("6. Trocar de numero");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao, numero;
        numero = ler();

        do {

            imprimirMenu();

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Se true é numero par se false é impar: " + (par(numero)));
                    break;

                case 2:
                    System.out.println("se zero ou positivo, ou false se negativo. " + (positivo(numero)));
                    break;

                case 3:
                    System.out.println("true se primo ou false se não primo." + (primo(numero)));
                    break;

                case 4:
                    System.out.println("true se perfeito ou false se não perfeito" + (perfeito(numero)));
                    break;
                case 5:
                    System.out.println("true se triangular ou false se não triangular: " + (triangular(numero)));
                    break;
                case 6:
                    numero=ler();
                    break;
            }

        } while (opcao != 0);

    }
}
// static é (apenas no package) != de public static (qualquer package)
//imprime mas nao faz return de dados // html pode ser usado nos comentarios
// comentar sempre /** passar o rato nas funções
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