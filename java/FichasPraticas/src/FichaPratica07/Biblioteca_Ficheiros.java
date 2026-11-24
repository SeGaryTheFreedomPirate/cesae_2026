package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Biblioteca_Ficheiros {

    /**
     * Função que imprime um ficheiro na consola
     * @param caminho Caminho para o ficheiro a ser impresso (com extensão: .txt, .csv, etc)
     * @throws FileNotFoundException O ficheiro não existe
     */
    public static void lerFicheiro (String caminho) throws FileNotFoundException {
        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            System.out.println(linha);
        }

    }

    /**
     * Função que cria ficheiros
     * @param criar
     * @throws FileNotFoundException
     */
    public static void criarficheiro (String criar) throws FileNotFoundException {

        File ficheiro = new File("Files07/testabc.txt");
        PrintWriter printWriter = new PrintWriter(ficheiro);

        printWriter.close();
    }
}

//import java.io.File;import java.io.FileNotFoundException; import java.io.PrintWriter;import java.util.Scanner; //FUNÇÕES A IMPORTAR