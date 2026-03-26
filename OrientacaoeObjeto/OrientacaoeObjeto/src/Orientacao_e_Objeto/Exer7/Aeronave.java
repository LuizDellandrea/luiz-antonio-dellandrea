package Orientacao_e_Objeto.Exer7;

public class Aeronave {

    public static final int getPassageiros = 0;
    private String modelo;
    private int passageiros;
    private double velocidadeMaxima;
    private double capacidadeCombustivel;
    private double queimaCombustivelPorMinuto;

    public Aeronave(String modelo, int passageiros, double velocidadeMaxima, double capacidadeCombustivel,
            double queimaCombustivelPorMinuto) {
       setModelo(modelo);
       setPassageiros(passageiros);
       setVelocidadeMaxima(velocidadeMaxima);
       setCapacidadeCombustivel(capacidadeCombustivel);
       setQueimaCombustivelPorMinuto(queimaCombustivelPorMinuto);
    }

    public String getModelo() {
        return modelo;
        
    }

    public double tempoDeVoo() {
        return capacidadeCombustivel / queimaCombustivelPorMinuto;
    }

    public double distanciaMaxima() {
        return velocidadeMaxima * tempoDeVoo();
    }

    public void setModelo(String modelo) {
      if (modelo == null || modelo.isBlank()) {
         System.out.println("Erro, modelo nulo ou vazio");
      } else {
         this.modelo = modelo;
      }
    }

    public void setPassageiros(int passageiros) {
       if (passageiros < 0) {
        System.out.println("Erro, numero negativo");
       } else {
        this.passageiros = passageiros;
       }
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public void setQueimaCombustivelPorMinuto(double queimaCombustivelPorMinuto) {
        this.queimaCombustivelPorMinuto = queimaCombustivelPorMinuto;
    }

}
