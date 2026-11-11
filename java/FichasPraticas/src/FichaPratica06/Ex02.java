package FichaPratica06;

import java.util.Scanner;

public class Ex02 {
    public static int pedido(Scanner input) {
        int numero;
        do {
            System.out.print("Introduza um número: ");
            numero = input.nextInt();
        } while (numero <= 0); // Repete enquanto for zero ou negativo return numero; // Retorna o número válido }
        return numero; // Retorna o número válido
    }

    public static void imprimir(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.print("*");
        }
        System.out.println();
        // Muda de linha no final }
    }

        public static void main (String[]args){
            Scanner input = new Scanner(System.in);
            int num = pedido(input);
            imprimir(num);



        }
    }


