import java.io.FileNotFoundException;
import java.util.Scanner;

import static Funcoes.FuncoesAdmin.menuAdmin;
import static Funcoes.FuncoesCliente.menuCliente;
import static Funcoes.Library_fReutilizaveis_Coments.imprimirFicheiro;
import static Funcoes.Library_fReutilizaveis_Coments.lerFicheiroParaMatriz;

public class GrandCinemaOS {

    public static void menuInicial() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        String[][] matrizAcesso = lerFicheiroParaMatriz("GrandeEcra_Ficheiros/GrandeEcra_AdminLogin.csv", ";");
        int opcao;

        do {
            System.out.println("============GRANDECRA============");
            System.out.println("ALL AROUND YOU.");
            System.out.println("1. Cliente");
            System.out.println("2. Administrador");
            System.out.println("0. Sair");
            System.out.println("============GRANDECRA============");

            System.out.print("\nOpção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Cliente
                    menuCliente();
                    break;

                case 2: // Admin
                    System.out.print("Username: ");
                    String usernameInput = input.next();

                    System.out.print("Password: ");
                    String passwordInput = input.next();

                    boolean autenticado = false;

                    for (int i = 0; i < matrizAcesso.length; i++) {
                        if (usernameInput.equals(matrizAcesso[i][0]) && passwordInput.equals(matrizAcesso[i][1])) {
                            autenticado = true;
                            menuAdmin();
                            break;
                        }
                    }

                    if (!autenticado) {
                        System.out.println("Credenciais inválidas");
                    }
                    break;

                case 0:
                    System.out.println("See you next time :)");
                    break;

                default:
                    System.out.println("Inválido");
                    break;
            }

        } while (opcao != 0);
        imprimirFicheiro("GrandeEcra_Ficheiros/GrandeEcra_Copyright.txt");
    }

    public static void main(String[] args) throws FileNotFoundException {
        menuInicial();
    }
}


