package FichaPratica07;

import java.io.FileNotFoundException;

import static FichaPratica07.Biblioteca_Ficheiros.lerFicheiro;

public class Ex01 {
    public static void main(String[] args) throws FileNotFoundException {

        lerFicheiro("Files07/exercicio_01.txt");

        System.out.println();

        lerFicheiro("Files07/exercicio_01_Alternativa01.txt");

        System.out.println();

        lerFicheiro("Files07/exercicio_01_Alternativa02.txt");
    }
}

