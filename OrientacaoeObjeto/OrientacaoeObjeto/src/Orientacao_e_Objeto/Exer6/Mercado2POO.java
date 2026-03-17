package Orientacao_e_Objeto.Exer6;



public class Mercado2POO {
     public static void main(String[] args) {
    Mercado2 unidadeDeBlumenau = new Mercado2();

        unidadeDeBlumenau.nome = "Blumenau";
        unidadeDeBlumenau.macasVendidas = 100;
        unidadeDeBlumenau.precoMaca = 5.30;
        unidadeDeBlumenau.laranjasVendidas = 200;
        unidadeDeBlumenau.precoLaranja = 3.50;


        Mercado2 unidadeDeJoinville = new Mercado2();

        unidadeDeJoinville.nome = "Joinville";
        unidadeDeJoinville.macasVendidas = 100;
        unidadeDeJoinville.precoMaca = 5.30;
        unidadeDeJoinville.laranjasVendidas = 200;
        unidadeDeJoinville.precoLaranja = 3.50;

        Mercado2 unidadeDeFlorianopolis = new Mercado2();

        unidadeDeFlorianopolis.nome = "Florianopolis";
        unidadeDeFlorianopolis.macasVendidas = 100;
        unidadeDeFlorianopolis.precoMaca = 5.30;
        unidadeDeFlorianopolis.laranjasVendidas = 200;
        unidadeDeFlorianopolis.precoLaranja = 3.50;


        Mercado2 maiorMacas = unidadeDeBlumenau;

        if (unidadeDeJoinville.receitaMacas() > maiorMacas.receitaMacas()) {
            maiorMacas = unidadeDeJoinville;
        }

        if (unidadeDeFlorianopolis.receitaMacas() > maiorMacas.receitaMacas()) {
            maiorMacas = unidadeDeFlorianopolis;
        }

        Mercado2 menorLaranjas = unidadeDeBlumenau;

        if (unidadeDeJoinville.receitaLaranjas() < menorLaranjas.receitaLaranjas()) {
            menorLaranjas = unidadeDeJoinville;
        }

        if (unidadeDeFlorianopolis.receitaLaranjas() < menorLaranjas.receitaLaranjas()) {
            menorLaranjas = unidadeDeFlorianopolis;
        }

        
        double totalB = unidadeDeBlumenau.receitaTotal();
        double totalJ = unidadeDeJoinville.receitaTotal();
        double totalF = unidadeDeFlorianopolis.receitaTotal();

        String segunda;

        if ((totalB > totalJ && totalB < totalF) || (totalB > totalF && totalB < totalJ)) {
            segunda = unidadeDeBlumenau.nome;
        } else if ((totalJ > totalB && totalJ < totalF) || (totalJ > totalF && totalJ < totalB)) {
            segunda = unidadeDeJoinville.nome;
        } else {
            segunda = unidadeDeFlorianopolis.nome;
        }

        
        double totalMacas = unidadeDeBlumenau.receitaMacas()
                + unidadeDeJoinville.receitaMacas()
                + unidadeDeFlorianopolis.receitaMacas();

        double totalLaranjas = unidadeDeBlumenau.receitaLaranjas()
                + unidadeDeJoinville.receitaLaranjas()
                + unidadeDeFlorianopolis.receitaLaranjas();

       
        System.out.println("\n===== RESULTADO =====");

        System.out.println("a) Maior receita com maçãs: " + maiorMacas.nome);

        System.out.println("b) Menor receita com laranjas: " + menorLaranjas.nome);

        System.out.println("c) Segunda maior receita total: " + segunda);

        if (totalMacas > totalLaranjas) {
            System.out.println("d) A franquia teve mais lucro com maçãs");
        } else {
            System.out.println("d) A franquia teve mais lucro com laranjas");
        }
    }

     }
     

