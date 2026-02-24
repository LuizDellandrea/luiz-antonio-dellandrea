import java.util.Scanner;

public class Primeiro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
          System.out.print("Digite a sua matrícula: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();

            System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua quantidade de horas trabalhadas: ");
        double trabalhadas = scanner.nextDouble();

        System.out.println("Digite o valor da sua hora: ");
        double hora = scanner.nextDouble();

        double total = hora * trabalhadas;
        double totalt = total * 4;


        System.out.println("Úsuario: "+ matricula + " "+ nome + ". Seu salário é de " + totalt);
        


    }
    
}
