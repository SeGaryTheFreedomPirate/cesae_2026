package Funcoes;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Funcoes.Library_fReutilizaveis_Coments.menuConsultaFicheiros;

public class FuncoesAdmin {


    public static void menuAdmin() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("============MENU ADMIN============");
            System.out.println("1. Consultar ficheiros");
            System.out.println("2. Estatisticas gerais de Vendas");
            System.out.println("3. Receita por sala");
            System.out.println("4. Receita por filme");
            System.out.println("5. TOP 3 filmes maior receita");
            System.out.println("6. Reset lotação de uma sala");
            System.out.println("0. Voltar");
            System.out.println("============MENU ADMIN============");

            System.out.print("\nOpção: ");
            opcao = input.nextInt();    // cada case deve de ter uma função especifica

            switch (opcao) {

                case 1:
                    menuConsultaFicheiros();
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
