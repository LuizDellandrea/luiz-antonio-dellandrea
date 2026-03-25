package Orientacao_e_Objeto.Exer6;


public class Mercado2 {
    
        

        String nome;
        int macasVendidas;
        double precoMaca;
        int laranjasVendidas;
        double precoLaranja;

        
   public Mercado2(String string, int i, double d, int j, double e) {
            
        }   

   public Mercado2() {
    
}

   public double receitaMacas() {
        return macasVendidas * precoMaca;
    }

    public double receitaLaranjas() {
        return laranjasVendidas * precoLaranja;
    }

    public double receitaTotal() {
        return receitaMacas() + receitaLaranjas();
    }
}

/*Calcule:
a) Quem teve a maior receita vendendo maçãs?
b) Quem teve a menor receita vendendo laranjas?
c) Qual das lojas teve a segunda maior receita total?
d) Juntando as 3 lojas, a franquia teve uma receita maior vendendo maçãs ou laranjas?*/