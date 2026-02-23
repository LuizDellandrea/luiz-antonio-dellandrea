import java.util.Scanner;

public class setimo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        int maior, menor, soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        maior = numeros[0];
        menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }

            soma += numeros[i];
        }

        double media = (double) soma / numeros.length;

        System.out.println("\nMaior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media);

        scanner.close();

    }
}