package Orientacao_e_Objeto.Exer9;

public class CarroPOO {
   

    private double velocidade;

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(double valor) {
        if (valor >= 0 && valor < 20) {
            velocidade = velocidade + valor;
        } else {
            System.out.println("Erro: valor para acelerar inválido");
        }
    }

    public void reduzir(double valor) {
        if (valor >= 0 && valor < 30) {
            velocidade = velocidade - valor;
        } else {
            System.out.println("Erro: valor para reduzir inválido");
        }
    }

}
