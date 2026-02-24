import java.util.Scanner;

public class Sexto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

         System.out.print("Digite o peso da massa ");
        double massaprimeira = scanner.nextDouble();


        double massa = massaprimeira;
        int tempo = 0;

        while (massa >= 0.0005) {
            massa = massa / 2;
            tempo += 50;
        }

        System.out.println("\nMassa inicial: " +massaprimeira+ " Kg");
        System.out.println("Massa final: " + massa + " Kg");
        System.out.println("Tempo necessário: " + tempo + " segundos");

        scanner.close();


    }
}
