package CalculoDesconto;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Me informe o valor da roupa");
        float valor = entrada.nextFloat();

        if (valor < 300) {
            System.out.println("O pre�o �: " + (valor - (valor * 0.15)));
        }

        if (valor >= 300) {
            System.out.println("O pre�o �: " + (valor - (valor * 0.2)));
        }
    }
}