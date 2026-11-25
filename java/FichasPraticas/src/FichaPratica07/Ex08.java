package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) throws FileNotFoundException {

        double totalVendas = 0, totalLinha = 0;
        File ficheiro = new File("Files07/exercicio_08.csv");
        Scanner sc = new Scanner(ficheiro);

        //AVANÇAR CABEÇALHO
        sc.nextLine();

        while (sc.hasNextLine()) {
            String linhaAtual = sc.nextLine();
            String[] linhaSeparada = linhaAtual.split(",");

            totalLinha = Double.parseDouble(linhaSeparada[2]) * Double.parseDouble(linhaSeparada[3]);
            totalVendas = totalLinha + totalVendas;

        }

        System.out.println("O total de vendas é: "+ totalVendas);

    }
}
