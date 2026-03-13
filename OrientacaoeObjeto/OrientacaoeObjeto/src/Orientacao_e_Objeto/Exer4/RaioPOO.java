package Orientacao_e_Objeto.Exer4;

import java.util.Scanner;

public class RaioPOO {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo();
        Circulo c3 = new Circulo();
        Circulo c4 = new Circulo();

        System.out.print("Digite o raio do círculo 1: ");
        c1.raio = input.nextDouble();

        System.out.print("Digite o raio do círculo 2: ");
        c2.raio = input.nextDouble();

        System.out.print("Digite o raio do círculo 3: ");
        c3.raio = input.nextDouble();

        System.out.print("Digite o raio do círculo 4: ");
        c4.raio = input.nextDouble();

        System.out.printf("Área círculo 1: %.2f%n", c1.calcularArea());
        System.out.printf("Área círculo 2: %.2f%n", c2.calcularArea());    
        System.out.printf("Área círculo 3: %.2f%n", c3.calcularArea());
        System.out.printf("Área círculo 4: %.2f%n", c4.calcularArea());
    }
}