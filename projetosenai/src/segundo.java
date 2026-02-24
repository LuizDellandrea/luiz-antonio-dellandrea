import java.util.Scanner;

public class Segundo {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o seu salário fixo: ");
        double fixo = scanner.nextDouble();

        System.out.print("Digite o total de vendas no mês: ");
        double vendas = scanner.nextDouble();

      
        double comissao = vendas * 0.15;

       
        double totalReceber = fixo + comissao;

        
        System.out.printf( nome+ " vai a receber R$"+ totalReceber);

    }
}
