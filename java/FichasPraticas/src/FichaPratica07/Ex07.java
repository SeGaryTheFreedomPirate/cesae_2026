package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) throws FileNotFoundException {

        int totalPalavras = 0, totalLinhas = 0;
        File ficheiro = new File("Files07/exercicio_06.txt");
        Scanner sc = new Scanner(ficheiro);

        while (sc.hasNext()) {
            totalPalavras = totalPalavras + 1;
            sc.next();
        }

        System.out.println("O total de palavras é: " + totalPalavras);

    }
}
