package ClassificarTriangulo;

import java.util.Scanner;

public class Triangulo {
    public static void main (String args[]) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Me Informe o Valor do Cateto Adjacente");
        float catetoAdj = entrada.nextFloat();

        System.out.println("Me Informe o Valor do Cateto Oposto");
        float catetoOpos = entrada.nextFloat();

        System.out.println("Me Informe o Valor da Hipotenusa");
        float hipotenusa = entrada.nextFloat();

        if (catetoAdj != catetoOpos && catetoOpos != hipotenusa) 
            System.out.println("O tri�ngulo � escaleno");
        if (catetoAdj == catetoOpos && catetoOpos != hipotenusa) 
            System.out.println("O tri�ngulo � is�celes");
        if (catetoAdj == catetoOpos && catetoOpos == hipotenusa)
            System.out.println("O tri�ngulo � equil�tero");
    }
}
