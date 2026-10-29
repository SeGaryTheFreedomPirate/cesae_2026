package FichaPratica02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao;

        System.out.println("1.criar ");
        System.out.println("2.atualizar ");
        System.out.println("3.eliminar ");
        System.out.println("4.sair " );
        System.out.print("QUAL QUER ACEDER? ");
        opcao = input.nextInt();




        switch (opcao) {

            case 1:
                System.out.println("1.criar ");
                break;

            case 2:
                System.out.println("2.atualizar");
                break;

            case 3:
                System.out.println("3.eliminar ");
                break;

            case 4:
                System.out.println("4.sair " );
                break;

            default:
                System.out.println("Operação inválida.");

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
