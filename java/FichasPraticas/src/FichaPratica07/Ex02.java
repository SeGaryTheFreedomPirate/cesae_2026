package FichaPratica07;

import java.io.FileNotFoundException;

import static FichaPratica07.Biblioteca_Ficheiros.criarFicheiro;

//criar e escrever dentro de ficheiro
public class Ex02 {
    public static void main(String[] args) throws FileNotFoundException {

        criarFicheiro("Files07/ola.txt","funciona");

    }
}
