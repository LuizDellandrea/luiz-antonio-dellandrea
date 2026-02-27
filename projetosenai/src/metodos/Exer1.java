package metodos;

import java.util.Scanner;

public class Exer1 {

    static int numero;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 à 4 ...");
        numero = scanner.nextInt();

        estacoes();

    }

    public static void estacoes() {

        if (numero == 1) {
            verao();
        } else if (numero == 2) {
            inverno();
        } else if (numero == 3) {
            primavera();
        } else if (numero == 4) {
            outono();
        } else {
            System.out.println("Número inválido");
        }
    }

    public static void verao() {
        System.out.print("É verão, o tempo está quente");
    }

    public static void inverno() {
        System.out.print("É inverno, o tempo está frio");
    }

    public static void primavera() {
        System.out.print("É primavera, o tempo está bonito");
    }

    public static void outono() {
        System.out.print("É outono, o tempo está agradável");

    }

}
