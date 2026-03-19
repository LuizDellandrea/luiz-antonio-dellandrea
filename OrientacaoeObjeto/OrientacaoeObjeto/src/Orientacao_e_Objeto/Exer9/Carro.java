package Orientacao_e_Objeto.Exer9;

public class Carro {

    private double velocidade;

    public static void main(String[] args) {

        Carro c = new Carro();

        c.acelerar(10);
        System.out.println("Velocidade: " + c.getVelocidade());

        c.reduzir(5);
        System.out.println("Velocidade: " + c.getVelocidade());

        c.acelerar(50); 
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void acelerar(double valor) {
        if (valor >= 0 && valor < 20) {
            velocidade = velocidade + valor;
        } else {
            System.out.println("Erro ao acelerar");
        }
    }

    public void reduzir(double valor) {
        if (valor >= 0 && valor < 30) {
            velocidade = velocidade - valor;
        } else {
            System.out.println("Erro ao reduzir");
        }
    }
}

// Prof , não entendi nada desse exer 