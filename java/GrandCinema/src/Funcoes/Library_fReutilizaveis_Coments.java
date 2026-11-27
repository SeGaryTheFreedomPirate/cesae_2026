package Funcoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
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
                if (matrizSala[i][j].equals("1")) {
                    lugares++;
                }
            }
        }

        return lugares;
    }

    /**
     * Função que lê e retorna o total de lugares de uma sala
     *
     * @param matrizSala
     * @return
     */
    public static int totalLugares(String[][] matrizSala) {

        int lugares = 0;
        //percorrer matrizes com ciclos aninhados

        // Percorre cada linha da matriz
        for (int i = 0; i < matrizSala.length; i++) {
            // Percorre cada coluna (lugar) dentro da linha i
            for (int j = 0; j < matrizSala[i].length; j++) {
                if (matrizSala[i][j].equals("0") || matrizSala[i][j].equals("1")) {
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

    /**
     * usa pw para colocar o que foi guardado numa matriz (tamanho) num ficheiro (WARNING pw limpa tudo, precisamos tb de print ";")
     *
     * @param caminho
     * @param matrizSala
     * @throws FileNotFoundException
     */
    public static void resetLugaresFicheiro(String caminho, String[][] matrizSala) throws FileNotFoundException {

        PrintWriter pw = new PrintWriter((caminho));
        //percorrer matrizes com ciclos aninhados

        // Percorre cada linha da matriz
        for (int i = 0; i < matrizSala.length; i++) {
            // Percorre cada coluna (lugar) dentro da linha i
            for (int j = 0; j < matrizSala[i].length; j++) {
                pw.print("0");
                if (j < matrizSala[i].length - 1) {
                    pw.print(";");
                }


            }
            pw.println();
        }
        pw.close();
    }


    public static void topFilmes() throws FileNotFoundException {
        String[][] matrizBilhetes = lerFicheiroParaMatrizSemCabecalho("GrandeEcra_Ficheiros/GrandeEcra_Bilhetes.csv", ";");
        int lugar1, lugar2, lugar3;

        System.out.println("***** TOP 3 FILMES COM MAIOR RECEITA ***** ");

        for (int i = 0; i < matrizBilhetes.length; i++) {
            for (int j = 0; j < matrizBilhetes[i].length; j++) {


            }
        }
    } // por falta de tempo desisti desta e da reserva de lugares//

    /**
     * submenu de limpeza de salas
     *
     * @throws FileNotFoundException
     */
    public static void resetSala() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao, lugaresLibres = 0, totalLugares = 0;
        String confirm;


        System.out.println(" 1 – Mar | 2 – Sol | 3 – Terra ");
        System.out.println("Que sala pretende resetar?");
        opcao = input.nextInt();
        // FAZER FUNÇÃO DE RESET LEITURA DE LENGHT DE MATRIZ E LEITURA DE QUANTOS LUGARES LIBERTADOS
        switch (opcao) {

            case 1:
                System.out.println("Confirma a reposicao da lotacao? (S/N):");
                confirm = input.next();
                if (confirm.equals("S")) {
                    lugaresLibres = lugaresVendidos(lerFicheiroParaMatriz("GrandeEcra_Ficheiros/Sala_Mar.csv", ";"));// lugares libertados usando 2 funções aninhadas uma lê ficheiro para matriz outra retorna quantos lugares vamos libertar
                    System.out.println(lugaresLibres + " lugares libertados.");
                    totalLugares = totalLugares(lerFicheiroParaMatriz("GrandeEcra_Ficheiros/Sala_Mar.csv", ";"));
                    System.out.println("Sala " + opcao + " : " + totalLugares + " lugares disponiveis de " + totalLugares);
                    resetLugaresFicheiro("GrandeEcra_Ficheiros/Sala_Mar.csv", lerFicheiroParaMatriz("GrandeEcra_Ficheiros/Sala_Mar.csv", ";"));
                }
                break;

            case 2:
                System.out.println("Confirma a reposicao da lotacao? (S/N):");
                confirm = input.next();
                if (confirm.equals("S")) {
                    lugaresLibres = lugaresVendidos(lerFicheiroParaMatriz("GrandeEcra_Ficheiros/Sala_Sol.csv", ";"));
                    System.out.println(lugaresLibres + " lugares libertados.");
                    totalLugares = totalLugares(lerFicheiroParaMatriz("GrandeEcra_Ficheiros/Sala_Sol.csv", ";"));
                    System.out.println("Sala " + opcao + " : " + totalLugares + " lugares disponiveis de " + totalLugares);
                    resetLugaresFicheiro("GrandeEcra_Ficheiros/Sala_Sol.csv", lerFicheiroParaMatriz("GrandeEcra_Ficheiros/Sala_Sol.csv", ";"));
                }
                break;
            case 3:
                System.out.println("Confirma a reposicao da lotacao? (S/N):");
                confirm = input.next();
                if (confirm.equals("S")) {
                    lugaresLibres = lugaresVendidos(lerFicheiroParaMatriz("GrandeEcra_Ficheiros/Sala_Terra.csv", ";"));
                    System.out.println(lugaresLibres + " lugares libertados.");
                    totalLugares = totalLugares(lerFicheiroParaMatriz("GrandeEcra_Ficheiros/Sala_Terra.csv", ";"));
                    System.out.println("Sala " + opcao + " : " + totalLugares + " lugares disponiveis de " + totalLugares);
                    resetLugaresFicheiro("GrandeEcra_Ficheiros/Sala_Terra.csv", lerFicheiroParaMatriz("GrandeEcra_Ficheiros/Sala_Terra.csv", ";"));
                }
                break;

            default:
                System.out.println("Opção de sala inválida.");
                break;
        }


    }

    /**
     * Imprimir totalidade de ficheiro na consola
     *
     * @param caminho
     * @throws FileNotFoundException
     */
    public static void imprimirFicheiro(String caminho) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            System.out.println(linha);
        }
    }

    /**
     * Pesquisar filmes por input de utilizador + impressão de linha correspondente
     *
     * @param input
     * @throws FileNotFoundException
     */
    public static void pesquisarFilmesPorGenero(Scanner input) throws FileNotFoundException {

        input.nextLine();

        System.out.println("\n***** PESQUISAR FILMES POR GÉNERO *****");
        System.out.print("Introduza o género desejado: ");
        String generoProcurado = input.nextLine();

        File ficheiro = new File("GrandeEcra_Ficheiros/GrandeEcra_Filmes.csv");
        Scanner sc = new Scanner(ficheiro);

        sc.nextLine();

        int contadorFilmes = 0;
        System.out.println("\n--- FILMES ENCONTRADOS ---");

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String[] filmes = linha.split(";");
            String genero = filmes[2];
            if (genero.equalsIgnoreCase(generoProcurado)) {
                System.out.println(linha);
                contadorFilmes++;
            }
        }
        if (contadorFilmes == 0) {
            System.out.println(" Nenhum filme encontrado para o género: " + generoProcurado);
        }
        sc.close();


    }

    /**
     * Print matriz de uma sala com espaços X && O
     *
     * @param matrizSala
     */
    public static void printMatrizXO(String[][] matrizSala) {

        for (int i = 0; i < matrizSala.length; i++) {
            for (int j = 0; j < matrizSala[i].length; j++) {
                if (matrizSala[i][j].equals("1")) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }


    }

    /**
     * Print Sala mais ocupação
     *
     * @throws FileNotFoundException
     */
    public static void printSala() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao, dispon = 0;
        double taxa;
        String[][] matrizMar = lerFicheiroParaMatriz("GrandeEcra_Ficheiros/Sala_Mar.csv", ";");
        String[][] matrizSol = lerFicheiroParaMatriz("GrandeEcra_Ficheiros/Sala_Sol.csv", ";");
        String[][] matrizTerra = lerFicheiroParaMatriz("GrandeEcra_Ficheiros/Sala_Terra.csv", ";");

        System.out.println(" 1 – Mar | 2 – Sol | 3 – Terra ");
        System.out.println("Que sala pretende consultar a ocupação?");
        opcao = input.nextInt();
        switch (opcao) {

            case 1:
                System.out.println("SALA MAR");
                System.out.println("ECRA");
                System.out.println("==========================");


                for (int j = 0; j < matrizMar[0].length; j++) {
                    System.out.print((j + 1) + " ");
                }

                System.out.println();
                printMatrizXO(matrizMar);
                System.out.println();

                System.out.println("O - Disponivel | X - Ocupado ");
                dispon = totalLugares(matrizMar) - lugaresVendidos(matrizMar);
                System.out.println("Lotação|" + totalLugares(matrizMar) + " Disponiveis|" + dispon + " Ocupados|" + lugaresVendidos(matrizMar));
                System.out.println("O - Disponivel | X - Ocupado ");
                taxa = ((double) lugaresVendidos(matrizMar) / totalLugares(matrizMar)) * 100;
                System.out.println("Taxa de ocupação: " + taxa + "%");
                break;

            case 2:
                System.out.println("SALA SOL");
                System.out.println("ECRA");
                System.out.println("==========================");

                for (int j = 0; j < matrizSol[0].length; j++) {
                    System.out.print((j + 1) + " ");
                }

                System.out.println();
                printMatrizXO(matrizSol);
                System.out.println();

                System.out.println("O - Disponivel | X - Ocupado ");
                dispon = totalLugares(matrizSol) - lugaresVendidos(matrizSol);
                System.out.println("Lotação|" + totalLugares(matrizSol) + " Disponiveis|" + dispon + " Ocupados|" + lugaresVendidos(matrizSol));
                System.out.println("O - Disponivel | X - Ocupado ");
                taxa = ((double) lugaresVendidos(matrizSol) / totalLugares(matrizSol)) * 100;
                System.out.println("Taxa de ocupação: " + taxa + "%");
                break;
            case 3:
                System.out.println("SALA TERRA");
                System.out.println("ECRA");
                System.out.println("==========================");
                for (int j = 0; j < matrizTerra[0].length; j++) {
                    System.out.print((j + 1) + " ");
                }

                System.out.println();
                printMatrizXO(matrizTerra);
                System.out.println();

                System.out.println("O - Disponivel | X - Ocupado ");
                dispon = totalLugares(matrizTerra) - lugaresVendidos(matrizTerra);
                System.out.println("Lotação|" + totalLugares(matrizTerra) + " Disponiveis|" + dispon + " Ocupados|" + lugaresVendidos(matrizTerra));
                System.out.println("O - Disponivel | X - Ocupado ");
                taxa = ((double) lugaresVendidos(matrizTerra) / totalLugares(matrizTerra)) * 100;
                System.out.println("Taxa de ocupação: " + taxa + "%");
                break;

            default:
                System.out.println("Opção de sala inválida.");
                break;
        }

    } //não me lembro se existe alguma forma de correr e imprimir letras imprimi a sala sem as letras

    public static void recomendarFilmes(Scanner input) throws FileNotFoundException {
        input.nextLine();
        System.out.println("***** RECOMENDAR FILMES *****");
        System.out.print("Introduza a sua idade: ");
        int idadeCliente = input.nextInt();
        input.nextLine();
        System.out.print("Introduza o género preferido: ");
        String generoPreferido = input.nextLine();
        System.out.print("Introduza o tempo disponível (em minutos): ");
        int tempoDisponivel = input.nextInt();
        System.out.print("Introduza o ano mínimo de lançamento: ");
        int anoMinimo = input.nextInt();


    } // fiquei no inicio

    public static void quiz(Scanner input) throws FileNotFoundException {
        System.out.println("\n***** QUIZ CINEMATOGRÁFICO *****");
        System.out.println("1 - Curta-Metragem (5 perguntas)");
        System.out.println("2 - Longa-Metragem (10 perguntas)");
        System.out.println("3 - Saga Completa (20 perguntas)");
        System.out.print("Escolha a modalidade: ");
        int opcao = input.nextInt();
        int maxPerguntas, totalPerguntas;
        int certas = 0;
        int erradas = 0;

        switch (opcao) {
            case 1:
                maxPerguntas = 5;

                break;
            case 2:
                maxPerguntas = 10;
                break;
            case 3:
                maxPerguntas = 20;
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        String[][] quiz = lerFicheiroParaMatrizSemCabecalho("GrandeEcra_Ficheiros/GrandeEcra_Quiz.csv", ";");
        totalPerguntas = quiz.length;

        Random random = new Random();

        for (int i = 1; i <= maxPerguntas; i++) {

            int sorteio = random.nextInt(totalPerguntas);

            System.out.println("\n Pergunta " + i + ": " + quiz[sorteio][0]);
            System.out.println("1 " + quiz[sorteio][1]);
            System.out.println("2 " + quiz[sorteio][2]);
            System.out.println("3 " + quiz[sorteio][3]);
            System.out.println("4 " + quiz[sorteio][4]);
            System.out.print("Resposta: ");
            int respostaUtilizador = input.nextInt();

            int respostaCerta = Integer.parseInt(quiz[sorteio][5]);

            if (respostaUtilizador == respostaCerta) {
                System.out.println("Resposta Certa");
                certas++;
            } else {
                System.out.println("Resposta Errada, a resposta certa era a " + respostaCerta);
                erradas++;
            }
        }

        double taxa = ((double) certas / maxPerguntas) * 100;
        String points;

        if (taxa == 100) {
            points = "Oscar de ouro";
        } else if (taxa >= 75) {
            points = "Spielberg da freguesia";
        } else if (taxa >= 50) {
            points = "Cinefilo de bancada";
        } else if (taxa >= 25) {
            points = "So ve ao domingo à tarde";
        } else {
            points = "veio pelas pipocas";
        }
        System.out.println("\n***** RESULTADO DO QUIZ *****");
        System.out.println("Certas| " + certas + " | Erradas| " + erradas);
        System.out.println("Percentagem de sucesso: " + taxa + "%");
        System.out.println("Classificação| " + points);
    }  // não sei como evitar que a mesma pergunta apareça

}

//quiz = ex9
//equalsIgnoreCase() devia ter colocado esta função em muitos locais mas agora já não me lembro onde
//.equalignorecase resolve se letras estao maisculas ou minusculas
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



