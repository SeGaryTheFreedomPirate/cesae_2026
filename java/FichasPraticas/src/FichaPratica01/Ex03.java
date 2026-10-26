package FichaPratica01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double comprimento,largura,perímetro,área;
        System.out.println("Qual o comprimento do réctangulo?:");
        comprimento=input.nextInt();
        System.out.println("Qual a largura do réctangulo?");
        largura=input.nextInt();
        perímetro=comprimento+comprimento+largura+largura;
        área=comprimento*largura;
        System.out.println("O perímetro é: "+perímetro);
        System.out.println("A área é: "+área);



    }
}
