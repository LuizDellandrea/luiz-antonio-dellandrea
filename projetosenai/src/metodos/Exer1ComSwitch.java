package metodos;

import java.util.Scanner;

public class Exer1ComSwitch {
  static int numero;

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número de 1 à 4 ...");
    numero = scanner.nextInt();

    switch (numero) {
      case 1 -> verao();
      case 2 -> inverno();
      case 3 -> primavera();
      case 4 -> outono();
      default -> System.out.println("Número inválido!");

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