package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.Biblioteca_Ficheiros.lerFicheiroParaMatriz;
import static FichaPratica07.Biblioteca_Ficheiros.pesquisarConteudo;

public class Ex09 {

    public static void menu(String[][] matrizMusicas) {

        Scanner input = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("\n-+-+-+-+-+-+-+-+- PROGRAMA DE ANÁLISE DE PLAYLIST -+-+-+-+-+-+-+-+-\n");
            System.out.println("1. Pesquisa por Género");
            System.out.println("2. Pesquisa por Artista");
            System.out.println("3. Música mais longa");
            System.out.println("4. Músicas com duração superior");
            System.out.println("5. Número de músicas");
            System.out.println("0. Sair");

            System.out.print("\nOpção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Pesquisa por Género
                    System.out.println("\n-+-+-+-+- PESQUISA POR GÉNERO -+-+-+-+-");
                    System.out.print("Género a pesquisar (ex: Rock, Pop, Folk): ");
                    input.nextLine(); // Limpar o buffer
                    String generoPesquisar = input.nextLine();

                    pesquisarConteudo(matrizMusicas,generoPesquisar);
                    break;

                case 2: // Pesquisa por Artista
                    System.out.println("\n-+-+-+-+- PESQUISA POR ARTISTA -+-+-+-+-");
                    break;

                case 3: // Música mais longa
                    System.out.println("\n-+-+-+-+- MÚSICA MAIS LONGA -+-+-+-+-");
                    break;

                case 4: // Músicas com duração superior
                    System.out.println("\n-+-+-+-+- MÚSICAS COM DURAÇÃO SUPERIOR A -+-+-+-+-");
                    break;

                case 5: // Número de músicas
                    System.out.println("\n-+-+-+-+- NÚMERO DE MÚSICAS -+-+-+-+-");
                    System.out.println(matrizMusicas.length);
                    break;

                case 0: // Pesquisa por Género
                    System.out.println("\n-+-+-+-+- ATÉ LOGO -+-+-+-+-");
                    break;

                default:
                    System.out.println("\nOpção Inválida: " + opcao);
                    break;

            }

        } while (opcao != 0);

    }


    public static void main(String[] args) throws FileNotFoundException {
        String[][] matrizMusicas = lerFicheiroParaMatriz("FicheirosFicha07/exercicio_09.csv");
        menu(matrizMusicas);
    }
}






