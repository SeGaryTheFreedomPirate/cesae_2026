package FichaPratica06;

import java.util.Scanner;

public class Ex02 {
    /**
     * Função que pergunta ao utilizador um numero positivo e inteiro
     * @param input apenas entra na função após existir entrada para a variavel input no main
     * @return um numero valido a variavel dentro do main
     */
    public static int pedido(Scanner input) {
        int numero;
        do {
            System.out.print("Introduza um número: ");
            numero = input.nextInt();
        } while (numero <= 0); // Repete enquanto for zero ou negativo return numero; // Retorna o número válido }
        return numero; // Retorna o número válido
    }


    /**
     * função que apenas imprime a qauntidde de asteriscos que a variavel num tem
     *Não faz return aplica mos a estrutura void por nao retorna valores as variaveis do main apenas imprime na consola
     * @param quantidade
     */
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


