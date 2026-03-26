package Orientacao_e_Objeto.Exer7;

public class AeronavePOO {

    public static void main(String[] args) {
        Aeronave a1 = new Aeronave("Boing 747", 400, 1000, 1000, 5);
        Aeronave a2 = new Aeronave("Airbus A380", 500, 1200, 1500, 6);
        Aeronave a3 = new Aeronave("Embraer 190", 300, 800, 1000, 4);
        Aeronave a4 = new Aeronave("Cessna 172", 200, 500, 800, 3);

        Aeronave listAeronaves[] = { a1, a2, a3, a4 };
        int passageiros = 0;
        Aeronave aeronaveMaisPassageiros = null;
        for (int i = 0; i < listAeronaves.length; i++) {
            if (listAeronaves[i].getPassageiros > passageiros) {
                passageiros = listAeronaves[i].getPassageiros;
                aeronaveMaisPassageiros = listAeronaves[i];
            }
        }
        System.out.println("Aeronave mais passageiros: " + aeronaveMaisPassageiros.getModelo());

        double distanciaMaxima = 0;
        Aeronave aeronaveMaisDistancia = null;
        for (int i = 0; i < listAeronaves.length; i++) {
            if (listAeronaves[i].distanciaMaxima() > distanciaMaxima) {
                distanciaMaxima = listAeronaves[i].distanciaMaxima();
                aeronaveMaisDistancia = listAeronaves[i];
            }
        }
        System.out.println("Aeronave mais distância: " + aeronaveMaisDistancia.getModelo());

        double tempoDeVoo = 0;
        Aeronave aeronaveMaisTempo = null;
        for (int i = 0; i < listAeronaves.length; i++) {
            if (listAeronaves[i].tempoDeVoo() > tempoDeVoo) {
                tempoDeVoo = listAeronaves[i].tempoDeVoo();
                aeronaveMaisTempo = listAeronaves[i];
            }
        }
        System.out.println("Aeronave mais tempo de voo: " + aeronaveMaisTempo.getModelo());
    }

}
