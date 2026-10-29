package FichaPratica02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, resultado;

        System.out.print("Qual o saldo médio: ");
        num1 = input.nextInt();
        System.out.print("Qual o valor a movimentar?: ");
        num2 = input.nextInt();

        resultado = num1 + num2;
        //double saldo, movmento
        // saldo = saldo + movimento
        // if (saldo + movimento <=0)

        if (resultado >= 0) {
            System.out.println("Saldo atual" + resultado + "€");
        } else {
            System.out.println("Operação Inválida");
            System.out.println("Saldo atual: " + num1 + "€");
        }
        // //declarar ou iniciar as variaveis
        //        int num1, num2, resultado;
        //        String operacao;
        //        //ler valores de input
        // PENSAR 1º SEMPRE NO ALGORITMO
        //SWICTH CASE É SEMPRE NO CASO DE SER UM CASO ==
        //IF IF IF ELSE
//o que é um string e quando se usa em relação a ints e doubles ??


    }
}
