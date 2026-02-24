import java.util.Scanner;

public class Terceiro {
    
 public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        
        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: "+ imc);

        
        if (imc < 18.5) {
            System.out.println("Classificação: Magreza");
        } else if (imc <= 24.9) {
            System.out.println("Classificação: Saudável");
        } else if (imc <= 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc <= 34.9) {
            System.out.println("Classificação: Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Classificação: Obesidade Grau II (severa)");
        } else {
            System.out.println("Classificação: Obesidade Grau III (mórbida)");
        }

        scanner.close();
    }
}




