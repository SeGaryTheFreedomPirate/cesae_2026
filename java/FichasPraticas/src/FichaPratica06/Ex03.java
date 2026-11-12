package FichaPratica06;

import java.util.Scanner;

public class Ex03 {
    /**
     *Função de leitura de varivaveis de utilizadores nao tem pre requisitos para correr
     * @return
     */
    public static int ler(){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um número para ser analisado: ");
        return num = input.nextInt();
    }

    /**
     * Função para saber se um numero e par ou impar
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
     * @param num
     * @return
     */
    static boolean triangular(int num) {
        int soma = 0;
        if (num >= 0) {
            for (int i = 1; soma<num; i++)
                soma+=i;

            if (num == soma) {
                return true;
            }

        }
        return false;
    }
}
// nao existe divisao por 0
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