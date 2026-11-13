package FichaPratica06;

import java.util.Scanner;

public class Library {

    /**
     * Função para saber se um numero e par ou impar
     *
     * @param num
     * @return
     */
    public static boolean par(int num) {

        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * função para saber se um numero e positivo
     *
     * @param num
     * @return
     */
    public static boolean positivo(int num) {

        if (num >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * função para saber se um numero é primo
     *
     * @param num
     * @return
     */
    public static boolean primo(int num) {
        if (num <= 1) {
            return false; //não é primo
        }
        for (int i = 2; i < num; i++)
            if (num % i == 0) {
                return false; //é primo
            }

        return true;
    }

    /**
     * Função para saber se o numero é perfeito
     *
     * @param num
     * @return
     */
    static boolean perfeito(int num) {
        int soma = 0;
        for (int i = 1; i < num; i++)
            if (num % i == 0) {
                soma = i + soma;
            }
        if (soma == num) {
            return true;


        }
        return false;
    }
// numeros inteiros consecuticos 1+2+3=6

    /**
     * função para saber se o num é triangular
     *
     * @param num
     * @return
     */
    static boolean triangular(int num) {
        int soma = 0;
        if (num >= 0) {
            for (int i = 1; soma < num; i++)
                soma += i;

            if (num == soma) {
                return true;
            }

        }
        return false;
    }

    /**
     * Função de leitura de um numero inteiro
     *
     * @return input de utilizador
     *
     */
    public static int ler() {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um número para ser analisado: ");
        return num = input.nextInt();
    }

    /**
     * Função que lê um valor inteiro e positivo do utilizador
     *
     * @return Número inteiro e positivo
     */
    public static int lerInteiroPositivo() {
        Scanner input = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Insira um número inteiro positivo: ");
            numero = input.nextInt();
        } while (numero < 0);

        return numero;
    }

    /**
     * Função que lê um vetor de inteiros, de um determinado tamanho, com valores do utilizador
     *
     * @param tamanhoVetor Tamanho do vetor a ser lido
     * @return Vetor preenchido c/ números inteiros
     */
    public static int[] lerVetorInteiros(int tamanhoVetor) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[tamanhoVetor];

        // Leitura dos valores
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        return vetor;
    }

    /**
     * Função que imprime um vetor de inteiros na consola
     *
     * @param vetor Vetor a ser impresso
     */
    public static void imprimirVetorInteiros(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " | ");
        }
    }

    /**
     * Função que imprime um quadrado
     */
    public static void imprimirquadrado(int linha, int coluna, String car) {
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (i == 0 || i == linha - 1 || j == 0 || j == coluna - 1) {
                    System.out.print(car);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Função que descobre o maior elemento de um vetor de inteiros
     *
     * @param vetor Vetor a ser analisado
     * @return Maior elemento
     */
    public static int maiorElemento(int[] vetor) {
        int maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }

    /**
     * Função que descobre o menor elemento de um vetor de inteiros
     *
     * @param vetor Vetor a ser analisado
     * @return <b>Menor</b> elemento
     */
    public static int menorElemento(int[] vetor) {
        int menor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        return menor;
    }

    /**
     * Função que calcula se um vetor é ou não <b>Crescente</b>
     *
     * @param vetor Vetor a ser analisado
     * @return true se crescente | false se não crescente
     */
    public static boolean vetorCrescente(int[] vetor) {

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] <= vetor[i - 1]) {
                return false;
            }
        }

        return true;
    }


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

}

