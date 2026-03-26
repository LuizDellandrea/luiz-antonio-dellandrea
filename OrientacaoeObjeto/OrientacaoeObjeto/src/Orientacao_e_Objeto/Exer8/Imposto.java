package Orientacao_e_Objeto.Exer8;

public class Imposto {
  

   private String nome;
   private String cpf;
   private String uf;
   private double rendaAnual;

    Imposto(String nome, String cpf, String uf, double rendaAnual) {
      setNome(nome);
      setCpf(cpf);
      setUf(uf);
      setRendaAnual(rendaAnual);
    }

    
    public String getNome() {
        return nome;
        
    }


    public double calcularImposto() {

        double aliquota;

        if (rendaAnual <= 4000) {
            aliquota = 0;
        } else if (rendaAnual <= 9000) {
            aliquota = 0.058;
        } else if (rendaAnual <= 25000) {
            aliquota = 0.15;
        } else if (rendaAnual <= 35000) {
            aliquota = 0.275;
        } else {
            aliquota = 0.30;
        }

        return rendaAnual * aliquota;
    }


    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            System.out.println("Erro, nome nulo ou vazio");
        } else {
            this.nome = nome;
        }
    }

    public void setCpf(String cpf) {
     this.cpf = cpf;
    }


    public void setUf(String uf) {
       if (uf == null || uf.isBlank()) {
        System.out.println("Erro, UF nulo ou vazio");
       } else {
        
       }
    }


    public void setRendaAnual(double rendaAnual) {
        if (rendaAnual < 0 ) {
            System.out.println("Valor inválido");
        } else {
         this.rendaAnual = rendaAnual;
        }
    }
}

