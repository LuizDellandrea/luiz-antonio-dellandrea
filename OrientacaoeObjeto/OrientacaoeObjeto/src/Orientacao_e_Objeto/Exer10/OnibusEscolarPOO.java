package Orientacao_e_Objeto.Exer10;

import java.util.Scanner;

public class OnibusEscolarPOO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de professores: ");
        int professores = input.nextInt();
        System.out.println("Digite a quantidade de alunos: ");
        int alunos = input.nextInt();
        OnibusEscolar onibus = new OnibusEscolar(alunos, professores);
        System.out.println("Quantidade de alunos: " + onibus.alunos);
        System.out.println("Quantidade de professores: " + onibus.professores);
    }
}

/*Faça uma classe chamada OnibusEscolar, com os atributos quantidade de estudantes e
quantidade de professores
Faça uma exceção no método setAlunos que limite o número máximo de estudantes a 40. Se
um valor superior for informado, ajuste automaticamente para 40.
Caso o número de professores for 0, o número de alunos também deve ser zerado */