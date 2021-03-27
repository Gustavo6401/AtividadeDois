package AnoBissexto;

import java.util.Scanner;

public class Bissexto {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Me Informe o Ano");
        int ano = entrada.nextInt();

        if(ano % 4 == 0) {
            System.out.println("Ano Bissexto.");
        } else {
            System.out.println("Ano não bissexto");
        }
    }
}
