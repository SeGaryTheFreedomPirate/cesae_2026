package FichaPratica06;

import java.util.Scanner;

public class Ex01 {

    /**
     * não existe return apenas impressao na consola
     * @param animal esta variavel incorpora a variavel animal introduzido sem ela este paramatero nao funciona
     */
    public static void fazerBarulho(String animal) {
        switch (animal.toLowerCase()) {
            case "cao":
                System.out.println("Au au au");
                break;
            case "gato":
                System.out.println("Miau");
                break;
            case "peixe":
                System.out.println("Glub Glub");
                break;
            case "vaca":
                System.out.println("Muuuu");
                break;
            case "porco":
                System.out.println("Oinc oinc");
                break;
            default:
                System.out.println("Animal desconhecido");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduza um animal: ");
        String animalIntroduzido = input.next();
        fazerBarulho(animalIntroduzido);
    }
}
//imprime mas nao faz return de dados // html pode ser usado nos comentarios
// comentar sempre /** passar o rato nas funções
//separar os ciclos de leitura e de impressão
//IMPRIMIR 100 ENTERS NA CONSOLA
//for (;num <= 100 && num >= 0)
//if (num <= 100 && num >= 0)
// SWICTH CASE SO PARA IGUALDADES NAO DA PARA USAR NUNCA MAIORES E MENORES
//COMAND OPTION L
//CUIDADO COM LN IMPRESSÃO COM ENTER OU SEM ""
//num % 2 == 0 == comparação se for igual ??
//ler // criar e iniciar
// imprimir na consola
// numero ++; numero++;++numero;numero--;numero+=2;numero%=3
// tempo=numero; = soma=num1+ soma+1;
//SOUT
//EQUALS CUIDADO PARA STRINGS
// PENSAR 1º SEMPRE NO ALGORITMO
//SWICTH CASE É SEMPRE NO CASO DE SER UM CASO COMPARATIVO ==
//IF IF IF ELSE