package Funcoes;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Funcoes.Library_fReutilizaveis_Coments.*;

public class FuncoesCliente {
    public static void menuCliente() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        String nome, email, telefone;
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
                    System.out.print("Nome: ");
                    nome = input.next();
                    System.out.print("Telefone: ");
                    telefone = input.next();
                    System.out.print("Email: ");
                    email = input.next();
                    System.out.println("Cliente inserido com sucesso!");
                    System.out.println(nome);
                    System.out.println(telefone);
                    System.out.println(email);
                    break;

                case 2:
                    imprimirFicheiro("GrandeEcra_Ficheiros/GrandeEcra_Cartaz.txt");
                    break;

                case 3:
                    pesquisarFilmesPorGenero(input);
                    break;

                case 4:
                    printSala();
                    break;

                case 5:
                    break;

                case 6:
                    recomendarFilmes(input);
                    break;

                case 7:
                    quiz(input);
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
