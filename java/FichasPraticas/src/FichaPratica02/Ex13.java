package FichaPratica02;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horas, min;
        System.out.println("Introduza Horas:");
        horas = input.nextInt();
        System.out.println("Introduza Minutos: ");
        min = input.nextInt();


        if (horas<=12) {
            System.out.println("HORA ATUAL: " + horas + ":" + min + " AM");
        } else {horas = horas - 12;
            System.out.println("HORA ATUAL: " + horas + ":" + min + " PM");
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
