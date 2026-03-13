package Orientacao_e_Objeto.Exer5;

import java.util.Scanner;

public class Funcionario {
    Scanner senha;
    String nome;
    String sobrenome;
    double salario;
    double reajuste;

    public String nomeCompleto() {
        return nome + " " + sobrenome;
    }

    public double salarioAnual() {
        return salario * 12;
    }
    public double reajuste() {
        return  reajuste *12 ;
    }
    public double novoSalario() {
        return salario + reajuste;
    }
    public double novoSalarioAnual() {
        return salarioAnual() + reajuste();
    }
}

/*Crie uma classe Funcionário que terá como atributos:
• Identificação
• Nome
• Sobrenome
• Salário (mensal) */