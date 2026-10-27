package FichaPratica01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int imputmin, imputseg, totalalbseg = 0;
        System.out.println("seg 1?:");
        imputseg = input.nextInt();
        System.out.println("min 1?:");
        imputmin = input.nextInt();
        totalalbseg = totalalbseg + imputseg + (imputmin * 60);
        System.out.println("seg 2?:");
        imputseg = input.nextInt();
        System.out.println("min 2?:");
        imputmin = input.nextInt();
        totalalbseg = totalalbseg + imputseg + (imputmin * 60);
        //System.out.println("total seg"+totalalbseg);
        int horas, minutos, segundos;
        horas = totalalbseg / 3600;
        totalalbseg = totalalbseg % 3600;
        minutos = totalalbseg / 60;
        totalalbseg = totalalbseg % 60;
        segundos = totalalbseg;



    }
}
