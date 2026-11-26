import java.io.FileNotFoundException;
import java.util.Scanner;

import static Funcoes.FuncoesAdmin.menuAdmin;
import static Funcoes.FuncoesCliente.menuCliente;

public class GrandCinemaOS {

    public static void menuInicial() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

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

                    System.out.print("Username: ");    // como ler todos os usernames e fazer match á sua password via matriz ou vector
                    String usernameInput = input.next();

                    System.out.print("Password: ");
                    String passwordInput = input.next();

                    if (usernameInput.equals("quim") && passwordInput.equals("123")) {
                        menuAdmin();
                    } else {
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

    }

    public static void main(String[] args) throws FileNotFoundException {
        menuInicial();
    }


}
