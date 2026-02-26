package metodos;

import java.util.Scanner;

public class Exer2 {
    
static String nome;
static int idade;
     public static void main(String[] args) {

       
         Scanner imput = new Scanner(System.in);
        
            System.out.print("Digite seu nome: ");
        nome = imput.nextLine();

           System.out.print("Digite sua idade: ");
        idade = imput.nextInt();

        nomemetodo();

        idademetodo();
       
     }
        public static void nomemetodo() {
            System.out.println("O nome dele é " + nome);

        }

         public static void idademetodo() {
            System.out.println("Ele tem " + idade + " anos. E no momento está cusando tec. em desenvolviemento de sistemas. ");

        }


}
