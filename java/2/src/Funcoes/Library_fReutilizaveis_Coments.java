package Funcoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Library_fReutilizaveis_Coments {

    /**
     * menu para consulta de ficheiros leitura e impressão dos mesmos em consola
     *
     */
    public static void menuConsultaFicheiros() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("============MENU ConsultaFicheiros============");
            System.out.println("1. Consultar GrandeEcra_AdminLogin.csv ");
            System.out.println("2. Consultar GrandeEcra_Bilhetes.csv ");
            System.out.println("3. Consultar GrandeEcra_Cartaz.txt ");
            System.out.println("4. Consultar GrandeEcra_Copyright.txt ");
            System.out.println("5. Consultar GrandeEcra_Filmes.csv ");
            System.out.println("6. Consultar GrandeEcra_Quiz.csv ");
            System.out.println("7. Consultar Sala_Mar.csv ");
            System.out.println("8. Consultar Sala_Sol.csv");
            System.out.println("9. Consultar Sala_Terra.csv ");
            System.out.println("0. Voltar");
            System.out.println("============MENU ConsultaFicheiros============");

            System.out.print("\nOpção: ");
            opcao = input.nextInt();    // cada case deve ler e imprimir na consola um ficheiro especifico, falta fazer essa função de leitura e impressão

            switch (opcao) {

                case 1:
                    lerFicheiro("GrandeEcra_Ficheiros/GrandeEcra_AdminLogin.csv");
                    break;

                case 2:
                    lerFicheiro("/Users/freedompirate/cesae_2026/cesae_2026/java/GrandCinema/GrandeEcra_Ficheiros/GrandeEcra_Bilhetes.csv");
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

    /**
     * Função que imprime um ficheiro na consola
     *
     * @param caminho Caminho para o ficheiro a ser impresso (com extensão: .txt, .csv, etc)
     * @throws FileNotFoundException O ficheiro não existe
     */
    public static void lerFicheiro(String caminho) throws FileNotFoundException {
        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            System.out.println(linha);
        }

    }

//atalhos:sout,passar rato em funções,fori,cmd option l,
//tips:separar ciclos de leitura de impressão,cuidado com ln "" ou /n, == é igual,ler criar e inciar gavetas
//tip:cuidado incrementos e pós incrementos (numero ++; numero++;++numero;numero--;numero+=2;numero%=3)
//tip:equals em vez de = necessário para strings, pensar 1º sempre em algoritmo e como desconstruir o mesmo em problemas mais pequenos..
//IF IF || IF ELSE || Else If
//Fazer import de funções
//[0].lenght dá as colunas .lenght dá as linhas
//rename refactor apagar
//integerdoubleparse.int
//hasNext "VERIFICA E AVANÇA? APENAS" != next " ELE VAI AVANÇAR PARA OS PROXIMOS DADOS"


}
