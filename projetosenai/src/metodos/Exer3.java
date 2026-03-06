package metodos;

import java.util.Scanner;

public class Exer3 {
    static int mostrar;
    public static void main(String[] args) {
   
        Scanner imput = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = imput.nextInt();

        mostrar(numero); 


    }
    public static void mostrar(int n) {

        System.out.println("Número digitado: " + n);

        for (int i = 1; i <= 20; i++) {
            System.out.println(n + i);
        }
}
}
