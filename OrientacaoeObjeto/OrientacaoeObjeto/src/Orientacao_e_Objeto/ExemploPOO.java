package Orientacao_e_Objeto;

public class ExemploPOO {
    public static void main(String[] args) {

        Veiculo v1 = new Veiculo();

        v1.modelo = " Honda City ";
        v1.comprimento = 4.2;
        v1.passageiros = 5;
        v1.velmax = 190;
        v1.cor = "Vermelho";
        
        Veiculo v2 = new Veiculo();

        v2.modelo = " Gol  ";
        v2.comprimento = 3.9;
        v2.passageiros = 5;
        v2.velmax = 170;
        v2.cor = "Verde";


        if (v1.velmax > v2.velmax) {
            System.out.println("O carro mais rápido é o " + v1.modelo + " com " + v1.velmax + " km/h");
        } else {
            System.out.println("O carro mais rápido é o " + v2.modelo + " com " + v2.velmax + " km/h");
        }   
        

    }
}
