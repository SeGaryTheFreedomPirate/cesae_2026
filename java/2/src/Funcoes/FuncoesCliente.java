package Funcoes;

import java.util.Scanner;

public class FuncoesCliente {
    public static void menuCliente() {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("============MENU CLIENTE============");
            System.out.println("1. Novo Registo");
            System.out.println("2. Consultar Cartaz");
            System.out.println("3. Pesquisar filmes");
            System.out.println("4. Ver Mapa de uma sala");
            System.out.println("5. Reservar Bilhetes");
            System.out.println("6. Filmes Recomendados");
            System.out.println("7. QUIZ");
            System.out.println("0. Voltar");
            System.out.println("============MENU CLIENTE============");

            System.out.print("\nOpção: ");
            opcao = input.nextInt();    // cada case deve de ter uma função especifica

            switch (opcao) {

                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 0:
                    System.out.println("Voltar...");
                    break;

                default:
                    System.out.println("Inválido");
                    break;
            }

        } while (opcao != 0);

    }
}
