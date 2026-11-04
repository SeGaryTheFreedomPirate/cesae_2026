package FichaPratica03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 =0, media, soma=1,vezes=-1;

        while (num1!= -1) {
            System.out.print("Introduz um numero: ");
            num1 = input.nextInt();
            soma=soma+num1;
            vezes++;
        }
media=soma/vezes;

        System.out.print("Media: " + media);


    }
}
