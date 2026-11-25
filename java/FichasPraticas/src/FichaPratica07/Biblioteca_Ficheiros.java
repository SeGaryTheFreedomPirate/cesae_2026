package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Biblioteca_Ficheiros {

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
     * Função que cria e escreve num ficheiro algum conteudo (cuidado pois limpa o que existe a acrescenta)
     *
     * @param caminho e conteudo
     * @throws FileNotFoundException
     */
    public static void criarFicheiro(String caminho, String conteudo) throws FileNotFoundException {
        File ficheiro = new File(caminho);
        PrintWriter pw = new PrintWriter(ficheiro);
        pw.println(conteudo);
        pw.close();
    }

    /**
     * Função que copia o conteúdo de um ficheiro para outro ficheiro
     *
     * @param caminhoOriginal Caminho do ficheiro original (que contém a informação)
     * @param caminhoCopia    Caminho do ficheiro cópia (onde queremos colocar a informação)
     * @throws FileNotFoundException
     */
    public static void copiarFicheiro(String caminhoOriginal, String caminhoCopia) throws FileNotFoundException {
        File ficheiroOriginal = new File(caminhoOriginal);
        Scanner sc = new Scanner(ficheiroOriginal);

        File ficheiroCopia = new File(caminhoCopia);
        PrintWriter pw = new PrintWriter(ficheiroCopia);

        while (sc.hasNextLine()) {
            String linhaAtual = sc.nextLine();
            pw.println(linhaAtual);
        }

        pw.close();

    }

    /**
     * Leitura e soma de todos os numeros de um ficheiro
     *
     * @param caminho
     * @return total
     * @throws FileNotFoundException
     */
    public static int somarNumerosFicheiro(String caminho) throws FileNotFoundException {
        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        int total = 0;

        while (sc.hasNextInt()) {
            int numeroActual = sc.nextInt();
            total += numeroActual;
        }

        return total;

    }

    /**
     * Função para contar linhas de um ficheiro
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
            sc.hasNextLine();

        }

        return numeroLinhas;
    }


    /**
     * Contador de numero de colunas de um ficheiro a partir de um cabecalho
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
     * Função que lê tabela de um ficheiro para uma matriz
     * @param caminho
     * @return matriz preenchida
     * @throws FileNotFoundException
     */
    public static String[][] lerFicheiroParaMatriz(String caminho) throws FileNotFoundException {

        int numeroLinhasFicheiro = contarLinhasFicheiro(caminho);
        int numeroColunasFicheiro = contarColunasFicheiro(caminho, ",");

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
            String[] linhaSeparada = linhaAtual.split(",");

            for (int i = 0; i < linhaSeparada.length; i++) {
                matriz[linhaPreencher][i] = linhaSeparada[i];
            }

            linhaPreencher++;
        }

        return matriz;
    }

    /** Função que imprime na consola uma matriz
     *
     * @param matriz
     */
    public static void imprimirMatriz(String[][] matriz) {

        // Impressão da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t | ");
            }
            System.out.println();
        }
    }

    /**
     * Função que pesquisa um tipo de conteudo de uma matriz
     * @param matriz
     * @param conteudo
     */
    public static void pesquisarConteudo(String[][] matriz, String conteudo) {

        System.out.println("Tipo de dados pedido é: " + conteudo);

        for (int linha = 0; linha < matriz.length; linha++) {

            if (matriz[linha][2].equals(conteudo)) {
                System.out.println(matriz[linha][1] + " | " + matriz[linha][0]);
            }
        }
    }


    public static void menu(String[][] matriz) {

        Scanner input = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("\n-+-+-+-+-+-+-+-+- PROGRAMA DE ANÁLISE DE PLAYLIST -+-+-+-+-+-+-+-+-\n");
            System.out.println("1. Pesquisa por ");
            System.out.println("2. Pesquisa por ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("0.");

            System.out.print("\nOpção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Pesquisa por Género
                    System.out.println("\n-+-+-+-+- PESQUISA POR GÉNERO -+-+-+-+-");
                    System.out.print("Género a pesquisar (ex: Rock, Pop, Folk): ");
                    input.nextLine(); // Limpar o buffer
                    String generoPesquisar = input.nextLine();

                    pesquisarMusicasGenero(matrizMusicas,generoPesquisar);
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



}

//integerdoubleparse.int
//fori
//fazer funções  na biblioteca dos ex que não fiz
//[0].lenght dá as colunas .lenght dá as linhas
//rename refactor apagar
//hasNext "VERIFICA E AVANÇA? APENAS" != next " ELE VAI AVANÇAR PARA OS PROXIMOS DADOS"
//ESCRITA FICHEIROS
//FileNotFoundException
// source é codigo sem ficheiros ideal e estar no root quando sao poucos melhor uma pasta para files
// public static void usingScanner()throws FileNotFoundException EscreverFicheiro {
// File ficheiro = new File("exemplo.txt");   //abre o ficheiro
// PrintWriter escrita = new PrintWriter(ficheiro);
//PrintWriter.println(fileContent);
//printWriter.println("É a minha UFCD Favorita");
//printWriter.close(); //linha que grava conteudo no ficheiro
//SCANNER LEITURA
//Scanner SF = new Scanner(ficheiro)
//System.out.println
//String.split()
//hasNext();
//import java.io.File;import java.io.FileNotFoundException; import java.io.PrintWriter;import java.util.Scanner; //FUNÇÕES A IMPORTAR