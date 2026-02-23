import java.util.Scanner;

public class quarto {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();

        if (dia < 1 || dia >31) {
            System.out.print("Informe um dia válido");
        } else {
            System.out.print("Informe um mês: ");
        int mes = scanner.nextInt();

         if (mes < 1 || mes >12) {
            System.out.print("Informe um mês válido");
        } else {
            System.out.print("Informe um ano: ");
        int ano = scanner.nextInt();

        if (ano < 1000 || ano > 9999) {
             System.out.print("Informe um ano válido:");
        } else {
            System.out.println("Data válida");
        }
           System.out.println(dia+"/"+mes+"/"+ano);
        }


        }

       
}
}