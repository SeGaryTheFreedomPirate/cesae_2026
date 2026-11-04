package FichaPratica04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1,num2,resultado=0;
        String operacao,opcao;
       //boolean s=true,n=false;

       do {
           System.out.println("Qual o numero 1?: ");
           num1 = input.nextDouble();

           System.out.println("Qual o numero 2?: ");
           num2 = input.nextDouble();

           System.out.println("Qual a operação?: ");
           operacao = input.next();

           switch (operacao) {

               case "+":
                   resultado = num1 + num2;
                   System.out.println("Soma: " + resultado);
                   break;

               case "-":
                   resultado = num1 - num2;
                   System.out.println("Subtração: " + resultado);
                   break;

               case "*":
                   resultado = num1 * num2;
                   System.out.println("Multiplicação: " + resultado);
                   break;

               case "/":
                   resultado = num1 / num2;
                   System.out.println("Divisão: " + resultado);
                   break;

               default:
                   System.out.println("Operação inválida: " + operacao);
                   break;
           }
           System.out.println("Deseja continuar?");
           opcao = input.next();
       }while(!opcao.equals("n"));
       }

// ! negar a operação num string a opção deve ser sempre feita sem operadores ou seja "!=" equivalente a !opcao.equals("n"))
        //LN
//systemoutprint ln esta a imprimir ara a frente sem o ln o LN E EXTREMAMAENTE IMPORTANTE
//enquanto num1 for par imprime apenas os numeros pares ate ao nm1
//supoe que e maior que 2

//num % 2 == 0   == comparação se for igual ??

//ler // criar e iniciar
// imprimir na consola
// as chavetas bloquarm o valor numero ++; numero++;++numero;numero--;numero+=2;numero%=3
// tempo=numero; = soma=num1+ soma +1;
//////   // // //declarar ou iniciar as variaveis
//SOUT
//////        //        int num1, num2, resultado;
//////        //        String = A TEXTOS;
//////        //        //ler valores de input
//////        // PENSAR 1º SEMPRE NO ALGORITMO
//////        //SWICTH CASE É SEMPRE NO CASO DE SER UM CASO ==
//////        //IF IF IF ELSE
/////// /o que é um string e quando se usa em relação a ints e doubles ??
    }

