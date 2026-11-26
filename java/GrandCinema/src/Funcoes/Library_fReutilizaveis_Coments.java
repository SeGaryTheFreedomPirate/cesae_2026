package Funcoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static Funcoes.FuncoesAdmin.menuAdmin;
import static Funcoes.FuncoesCliente.menuCliente;

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
                    lerFicheiro("GrandeEcra_Ficheiros/GrandeEcra_Bilhetes.csv");
                    break;

                case 3:
                    lerFicheiro("GrandeEcra_Ficheiros/GrandeEcra_Cartaz.txt");
                    break;
                case 4:
                    lerFicheiro("GrandeEcra_Ficheiros/GrandeEcra_Copyright.txt");
                    break;
                case 5:
                    lerFicheiro("GrandeEcra_Ficheiros/GrandeEcra_Filmes.csv");
                    break;
                case 6:
                    lerFicheiro("GrandeEcra_Ficheiros/GrandeEcra_Quiz.csv");
                    break;
                case 7:
                    lerFicheiro("GrandeEcra_Ficheiros/Sala_Mar.csv");
                    break;
                case 8:
                    lerFicheiro("GrandeEcra_Ficheiros/Sala_Sol.csv");
                    break;
                case 9:
                    lerFicheiro("GrandeEcra_Ficheiros/Sala_Terra.csv");
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

    /**
     * Contador de numero de colunas de um ficheiro a partir de um cabecalho
     *
     * @param caminho
     * @param separador
     * @return numero total de colunas
     * @throws FileNotFoundException
     */
    public static int contarColunasFicheiro(String caminho, String separador) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        String cabecalho = sc.nextLine();
        String[] cabecalhoSeparado = cabecalho.split(separador);

        return cabecalhoSeparado.length;
    }

    /**
     * Função para contar linhas de um ficheiro
     *
     * @param caminho
     * @return numeroLinhas
     * @throws FileNotFoundException
     */
    public static int contarLinhasFicheiro(String caminho) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        int numeroLinhas = 0;

        while (sc.hasNextLine()) {
            numeroLinhas++;
            sc.nextLine();

        }

        return numeroLinhas;
    }

    /**
     * Função que lê tabela de um ficheiro para uma matriz (sem cabecalho)
     *
     * @param caminho
     * @return matriz preenchida
     * @throws FileNotFoundException
     */
    public static String[][] lerFicheiroParaMatrizSemCabecalho(String caminho, String separador) throws FileNotFoundException {

        int numeroLinhasFicheiro = contarLinhasFicheiro(caminho);
        int numeroColunasFicheiro = contarColunasFicheiro(caminho, separador);
        String[][] matriz = new String[numeroLinhasFicheiro - 1][numeroColunasFicheiro];

        // System.out.println("Linhas: "+matrizMusicas.length);
        // System.out.println("Colunas: "+matrizMusicas[0].length);

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        // Avançar cabeçalho
        sc.nextLine();

        int linhaPreencher = 0;

        while (sc.hasNextLine()) {
            String linhaAtual = sc.nextLine();
            String[] linhaSeparada = linhaAtual.split(separador);

            for (int i = 0; i < linhaSeparada.length; i++) {
                matriz[linhaPreencher][i] = linhaSeparada[i];
            }

            linhaPreencher++;
        }

        return matriz;
    }

    /**
     * Função que lê tabela de um ficheiro para uma matriz com cabecalho
     *
     * @param caminho
     * @return matriz preenchida
     * @throws FileNotFoundException
     */
    public static String[][] lerFicheiroParaMatriz(String caminho, String separador) throws FileNotFoundException {

        int numeroLinhasFicheiro = contarLinhasFicheiro(caminho);
        int numeroColunasFicheiro = contarColunasFicheiro(caminho, separador);

        String[][] matriz = new String[numeroLinhasFicheiro][numeroColunasFicheiro];

        // System.out.println("Linhas: "+matrizMusicas.length);
        // System.out.println("Colunas: "+matrizMusicas[0].length);

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        // Avançar cabeçalho
        //sc.nextLine();

        int linhaPreencher = 0;

        while (sc.hasNextLine()) {
            String linhaAtual = sc.nextLine();
            String[] linhaSeparada = linhaAtual.split(separador);

            for (int i = 0; i < linhaSeparada.length; i++) {
                matriz[linhaPreencher][i] = linhaSeparada[i];
            }

            linhaPreencher++;
        }

        return matriz;
    }

    /**
     * Função para contar linhas de um ficheiro sem cabecalho
     *
     * @param caminho
     * @return numeroLinhas
     * @throws FileNotFoundException
     */
    public static int contarLinhasFicheiroSemCabecalho(String caminho) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        int numeroLinhas = 0;
        //avança cabecalho
        sc.nextLine();

        while (sc.hasNextLine()) {
            numeroLinhas++;
            sc.nextLine();

        }

        return numeroLinhas;
    }

    /**
     * Total de Receita (Ultima coluna)
     *
     * @param matrizBilhetes
     * @return
     */
    public static double totalReceita(String[][] matrizBilhetes) {
        double totalVendas = 0, totalLinha;

        for (int i = 0; i < matrizBilhetes.length; i++) {
            totalLinha = Double.parseDouble(matrizBilhetes[i][10]);
            totalVendas = totalLinha + totalVendas;


        }
        return totalVendas;

    }

    /**
     * conta em matrizes quantas vezes tem um conteudo neste caso "1"
     *
     * @param matrizSala
     * @return
     */
    public static int lugaresVendidos(String[][] matrizSala) {

        int lugares = 0;
        //percorrer matrizes com ciclos aninhados

        // Percorre cada linha da matriz
        for (int i = 0; i < matrizSala.length; i++) {
            // Percorre cada coluna (lugar) dentro da linha i
            for (int j = 0; j < matrizSala[i].length; j++) {
                if (matrizSala[i][j] != "0") {
                    lugares++;
                }
            }
        }

        return lugares;
    }

    /**
     * Leitura de Receita de cada Sala
     *
     * @param matrizSala
     * @param sala
     * @return
     * @throws FileNotFoundException
     */
    public static double leituraReceitaSala(String[][] matrizSala, String sala) throws FileNotFoundException {

        double ReceitaSala = 0;
        String[][] matrizBilhetes = lerFicheiroParaMatrizSemCabecalho("GrandeEcra_Ficheiros/GrandeEcra_Bilhetes.csv", ";");
        double totalLinha;

        for (int i = 0; i < matrizSala.length; i++) {
            for (int j = 0; j < matrizSala[i].length; j++) {
                if (matrizSala[i][j].equals(sala)) {
                    totalLinha = Double.parseDouble(matrizBilhetes[i][10]);
                    ReceitaSala = totalLinha + ReceitaSala;


                }
            }
        }

        return ReceitaSala;


    }

    /**
     * Pede um filme ao utilizador e imprime a sua receita e qauntos bilhetes foram vendidos
     *
     * @throws FileNotFoundException
     */
    public static void receitaFilme() throws FileNotFoundException {

        String[][] matrizBilhetes = lerFicheiroParaMatrizSemCabecalho("GrandeEcra_Ficheiros/GrandeEcra_Bilhetes.csv", ";");
        Scanner input = new Scanner(System.in);
        String movie;
        double totalLinha, receitaMovie = 0;
        int totalBilhetes = 0;
        boolean found = false;


        System.out.println("Qual filme a pesquisar?");
        movie = input.nextLine();
        //input tem de ser nextline para apanhar o filme por ter espaços


        for (int i = 0; i < matrizBilhetes.length; i++) {
            for (int j = 0; j < matrizBilhetes[i].length; j++) {
                if (matrizBilhetes[i][j].equals(movie)) {
                    totalLinha = Double.parseDouble(matrizBilhetes[i][10]);
                    receitaMovie = totalLinha + receitaMovie;
                    totalBilhetes++;
                    found = true;

                }
            }
        }

        if (!found) {
            System.out.println("Filme inválido");
        } else {
            System.out.println("Filme: " + movie + " Receita: " + receitaMovie + "€ Bilhetes vendidos: " + totalBilhetes);
        }

    }


    public static void topFilmes() throws FileNotFoundException {
        String[][] matrizBilhetes = lerFicheiroParaMatrizSemCabecalho("GrandeEcra_Ficheiros/GrandeEcra_Bilhetes.csv", ";");
        int lugar1, lugar2, lugar3;

        System.out.println("***** TOP 3 FILMES COM MAIOR RECEITA ***** ");

        for (int i = 0; i < matrizBilhetes.length; i++) {
            for (int j = 0; j < matrizBilhetes[i].length; j++) {


            }
        }
    }

    public static void resetSala() {

        Scanner input = new Scanner(System.in);
        int opcao, lugaresLibres = 0, totalLugares = 0;
        String confirm;


        System.out.println(" 1 – Mar | 2 – Terra | 3 – Sol ");
        System.out.println("Que sala pretende resetar?");
        opcao = input.nextInt();
                   // FAZER FUNÇÃO DE RESET LEITURA DE LENGHT DE MATRIZ E LEITURA DE QUANTOS LUGARES LIBERTADOS
        switch (opcao) {

            case 1:
                System.out.println("Confirma a reposicao da lotacao? (S/N):");
                confirm = input.next();
                if (confirm.equals("S")) { // reset sala
                    System.out.println(lugaresLibres + " lugares libertados.");
                    System.out.println("Sala " + opcao + " :" + totalLugares + " lugares disponiveis de " + totalLugares);
                }
                break;

            case 2:
                System.out.println("Confirma a reposicao da lotacao? (S/N):");
                confirm = input.next();
                if (confirm.equals("S")) { // reset sala
                    System.out.println(lugaresLibres + " lugares libertados.");
                    System.out.println("Sala " + opcao + " :" + totalLugares + " lugares disponiveis de " + totalLugares);
                }
                break;
            case 3:
                System.out.println("Confirma a reposicao da lotacao? (S/N):");
                confirm = input.next();
                if (confirm.equals("S")) { // reset sala                                                                     break;
                    System.out.println(lugaresLibres + " lugares libertados.");
                    System.out.println("Sala " + opcao + " :" + totalLugares + " lugares disponiveis de " + totalLugares);
                }
                break;
        }


    }


}

// .5 e marcação de bilhetes deixar para o fim
//input tem de ser nextline para apanhar o filme por ter espaços
// forcar com sout a comunicação com a consola para perceber porque nao funciona
// em ifs comparar strings logo aseguir a primeira variavel.equals(string variable))
//atalhos:sout,passar rato em funções,fori,cmd option l,CMD + Right Click
//tips:separar ciclos de leitura de impressão,cuidado com ln "" ou /n, == é igual,ler criar e inciar gavetas
//tip:cuidado incrementos e pós incrementos (numero ++; numero++;++numero;numero--;numero+=2;numero%=3)
//tip:equals em vez de = necessário para strings, pensar 1º sempre em algoritmo e como desconstruir o mesmo em problemas mais pequenos..
//IF IF || IF ELSE || Else If
//Fazer import de funções
//[0].lenght dá as colunas .lenght dá as linhas
//rename refactor apagar
//integerdoubleparse.int
//hasNext "VERIFICA E AVANÇA? APENAS" != next " ELE VAI AVANÇAR PARA OS PROXIMOS DADOS"



