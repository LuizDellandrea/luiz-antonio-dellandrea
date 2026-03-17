package Orientacao_e_Objeto.Exer7;

public class AeronavePOO {
    public static void main(String[] args) {
        Aeronave a1 = new Aeronave();
        a1.modelo = "Boing 747";
        a1.passageiros = 300;
        a1.velocidadeMaxima = 800;
        a1.capacidadeCombustivel = 500;

        Aeronave a2 = new Aeronave();
        a2.modelo = "Airbus A380";
        a2.passageiros = 400;
        a2.velocidadeMaxima = 900;
        a2.capacidadeCombustivel = 600;

        Aeronave a3 = new Aeronave();
        a3.modelo = "Embraer 190";
        a3.passageiros = 200;
        a3.velocidadeMaxima = 700;
        a3.capacidadeCombustivel = 400;

        Aeronave a4 = new Aeronave();
        a4.modelo = "Airbus A320";
        a4.passageiros = 250;
        a4.velocidadeMaxima = 750;
        a4.capacidadeCombustivel = 450;

        Aeronave maisPassageiros = a1;
        if (a2.passageiros > maisPassageiros.passageiros) {
            maisPassageiros = a2;
        }
        if (a3.passageiros > maisPassageiros.passageiros) {
            maisPassageiros = a3;
        }
        if (a4.passageiros > maisPassageiros.passageiros) {
            maisPassageiros = a4;
        }
        System.out.println("Aeronave com mais passageiros: " + maisPassageiros.modelo);

        Aeronave maisTempo = a1;

        if (a2.tempoDeVoo() > maisTempo.tempoDeVoo()) maisTempo = a2;
        if (a3.tempoDeVoo() > maisTempo.tempoDeVoo()) maisTempo = a3;
        if (a4.tempoDeVoo() > maisTempo.tempoDeVoo()) maisTempo = a4;

        System.out.println("Aeronave com maior tempo de voo: " + maisTempo.modelo);
        
        Aeronave maisLonge = a1;

        if (a2.distanciaMaxima() > maisLonge.distanciaMaxima()) maisLonge = a2;
        if (a3.distanciaMaxima() > maisLonge.distanciaMaxima()) maisLonge = a3;
        if (a4.distanciaMaxima() > maisLonge.distanciaMaxima()) maisLonge = a4;

        System.out.println("Aeronave que voa mais longe: " + maisLonge.modelo);
//exer7
    }
}
