package Orientacao_e_Objeto.Exer12;

import java.util.Scanner;

public class InteiroPositivoPOO {
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        InteiroPositivo num = new InteiroPositivo();

        System.out.print("Digite um número positivo: ");
        int valor = sc.nextInt();

        num.setValor(valor);

        System.out.println("Fatorial: " + num.fatorial());

        num.divisores();

        num.fibonacci();

        sc.close();
    }
}

