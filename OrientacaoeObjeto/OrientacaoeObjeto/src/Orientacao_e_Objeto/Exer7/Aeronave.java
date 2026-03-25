package Orientacao_e_Objeto.Exer7;

public class Aeronave {

    String modelo;
    int passageiros;
    double velocidadeMaxima;
    double capacidadeCombustivel;
    double queimaCombustivelPorMinuto;

    public Aeronave(String modelo, int passageiros, double velocidadeMaxima, double capacidadeCombustivel,
            double queimaCombustivelPorMinuto) {
        this.modelo = modelo;
        this.passageiros = passageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.queimaCombustivelPorMinuto = queimaCombustivelPorMinuto;
    }

    public double tempoDeVoo() {
        return capacidadeCombustivel / queimaCombustivelPorMinuto;
    }

    public double distanciaMaxima() {
        return velocidadeMaxima * tempoDeVoo();
    }

}
