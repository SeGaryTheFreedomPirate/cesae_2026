package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

//criar e escrever dentro de ficheiro
public class Ex02 {
    public static void main(String[] args) throws FileNotFoundException {

        File ficheiro = new File("Files07/testabc.txt");
        PrintWriter printWriter = new PrintWriter(ficheiro);




        // FALTA LINHAS DE ESCRITA
        printWriter.close();
    }
}
