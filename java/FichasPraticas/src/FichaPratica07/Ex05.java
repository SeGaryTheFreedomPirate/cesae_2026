package FichaPratica07;

import java.io.FileNotFoundException;

import static FichaPratica07.Biblioteca_Ficheiros.somarNumerosFicheiro;

public class Ex05 {
    public static void main(String[] args) throws FileNotFoundException {


        System.out.println("A soma do ficheiro 1 é: " + somarNumerosFicheiro("Files07/exercicio_05_31.txt"));
        System.out.println("A soma do ficheiro 2 é: " + somarNumerosFicheiro("Files07/exercicio_05_1999.txt"));


    }
}
