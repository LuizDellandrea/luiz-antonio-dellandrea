package Orientacao_e_Objeto.Exer5;

import java.util.Scanner;



public class FuncionarioPOO {

    public static void main(String[] args) {


        Funcionario f1 = new Funcionario();
        
         
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário : ");
        f1.nome = input.nextLine();

        System.out.print("Digite o sobrenome do funcionário : ");
        f1.sobrenome = input.nextLine();

        System.out.println("Digite o salário do funcionário : ");
        f1.salario = input.nextDouble();

        System.out.println("Digite o reajuste salarial : ");
        f1.reajuste = input.nextDouble();



        System.out.printf("Nome completo: %s%n", f1.nomeCompleto());
        System.out.printf("Salário anual: %.2f%n", f1.salarioAnual());
        System.out.printf("Reajuste salarial: %.2f%n", f1.reajuste());
        System.out.printf("Novo salário mensal: %.2f%n", f1.novoSalario());
        System.out.printf("Novo salário anual: %.2f%n", f1.novoSalarioAnual());
    }
}