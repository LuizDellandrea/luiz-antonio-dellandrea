import java.util.Scanner;

public class Quinto {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inscricao;
        double altura;

        double maioraltura = 0;
        double menoraltura = 0;
        int inscricaomaior = 0;
        int inscricaomenor = 0;

        double somaalturas = 0;
        int quantidade = 0;

        System.out.print("Digite o número de inscrição (0 para sair): ");
        inscricao = scanner.nextInt();

        while (inscricao != 0) {

            System.out.print("Digite a altura do atleta: ");
            altura = scanner.nextDouble();

            if (quantidade == 0) {
                maioraltura = altura;
                menoraltura = altura;
                inscricaomaior = inscricao;
                inscricaomenor = inscricao;
            } else {
                if (altura > maioraltura) {
                    maioraltura = altura;
                    inscricaomaior = inscricao;
                }

                if (altura < menoraltura) {
                    menoraltura = altura;
                    inscricaomenor = inscricao;
                }
            }

            somaalturas += altura;
            quantidade++;

            System.out.print("Digite o número de inscrição (0 para sair): ");
            inscricao = scanner.nextInt();
        }

        if (quantidade > 0) {
            double media = somaalturas / quantidade;

            System.out.println("\nAtleta mais alto:");
            System.out.println("Inscrição: " + inscricaomaior + " - Altura: " + maioraltura);

            System.out.println("\nAtleta mais baixo:");
            System.out.println("Inscrição: " + inscricaomenor + " - Altura: " + menoraltura);

            System.out.println("\nAltura média: " + media);
            System.out.println("Quantidade de atletas: " + quantidade);
        } else {
            System.out.println("Nenhum atleta cadastrado.");
        }

        scanner.close();
    }
}

