package Orientacao_e_Objeto.Exer8;

public class ImpostoPOO {
 public static void main(String[] args) {

        Imposto[] contribuintes = new Imposto[5];

        contribuintes[0] = new Imposto("João", "111.111.111-11", "PR", 40000);
        contribuintes[1] = new Imposto("Maria", "222.222.222-22", "SC", 15000);
        contribuintes[2] = new Imposto("Carlos", "333.333.333-33", "RS", 8000);
        contribuintes[3] = new Imposto("Ana", "444.444.444-44", "PR", 9000);
        contribuintes[4] = new Imposto("Pedro", "555.555.555-55", "SC", 5000);

        double maiorImposto = 0;
        String nomeMaior = "";
        double totalImposto = 0;  

         for (int i = 0; i < contribuintes.length; i++) {

            double imposto = contribuintes[i].calcularImposto();

            System.out.println("Nome: " + contribuintes[i].getNome());
            System.out.println("Imposto a pagar: R$ " + imposto);
            System.out.println();

            totalImposto += imposto;

            if (imposto > maiorImposto) {
                maiorImposto = imposto;
                nomeMaior = contribuintes[i].getNome();
            }
        }

        System.out.println("Quem mais paga imposto: " + nomeMaior);
        System.out.println("Valor do maior imposto: R$ " + maiorImposto);

        System.out.println("Total de imposto pago pelos 5: R$ " + totalImposto);
    }
}
