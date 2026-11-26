package Funcoes;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Funcoes.Library_fReutilizaveis_Coments.*;

public class FuncoesAdmin {


    public static void menuAdmin() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao;
        double receitaMedia;
        String[][] matrizBilhetes = lerFicheiroParaMatrizSemCabecalho("GrandeEcra_Ficheiros/GrandeEcra_Bilhetes.csv", ";");
        receitaMedia=totalReceita(matrizBilhetes)/contarLinhasFicheiroSemCabecalho("GrandeEcra_Ficheiros/GrandeEcra_Bilhetes.csv");
        String[][] matrizMar= lerFicheiroParaMatriz("GrandeEcra_Ficheiros/Sala_Mar.csv",";");
        String[][] matrizSol= lerFicheiroParaMatriz("GrandeEcra_Ficheiros/Sala_Sol.csv",";");
        String[][] matrizTerra= lerFicheiroParaMatriz("GrandeEcra_Ficheiros/Sala_Terra.csv",";");

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
                    System.out.println("Total Bilhetes Vendidos: " + contarLinhasFicheiroSemCabecalho("GrandeEcra_Ficheiros/GrandeEcra_Bilhetes.csv"));
                    System.out.println("Receita total: " + totalReceita(matrizBilhetes));
                    System.out.println("Valor medio por bilhete: " + receitaMedia);
                    break;

                case 3:
                    System.out.println("Receita Sala Mar: ");
                    System.out.println("Bilhetes vendidos: " + lugaresVendidos(matrizMar) + " Total de Receita: " + leituraReceitaSala(matrizBilhetes,"Mar") );
                    System.out.println("Receita Sala Sol: ");
                    System.out.println("Bilhetes vendidos: " + lugaresVendidos(matrizSol) + " Total de Receita: " + leituraReceitaSala(matrizBilhetes,"Sol")  );
                    System.out.println("Receita Sala Terra: ");
                    System.out.println("Bilhetes vendidos: " + lugaresVendidos(matrizTerra) + " Total de Receita: " + leituraReceitaSala(matrizBilhetes,"Terra") );
                    break;

                case 4:
                    receitaFilme();
                    break;

                case 5:
                    topFilmes();
                    break;

                case 6:
                    resetSala();
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
