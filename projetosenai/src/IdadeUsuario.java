import java.util.Scanner;

public class IdadeUsuario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Você tem " + idade + " anos.");

        scanner.close();
    }

    
}
