package Orientacao_e_Objeto.Exer2;

public class MercadoPOO {
    public static void main(String[] args) {
        Mercado unidadeDeBlumenau = new Mercado();

        unidadeDeBlumenau.nome = "Blumenau";
        unidadeDeBlumenau.macasVendidas = 100;
        unidadeDeBlumenau.precoMaca = 5.30;
        unidadeDeBlumenau.laranjasVendidas = 200;
        unidadeDeBlumenau.precoLaranja = 3.50;

        Mercado unidadeDeJoinville = new Mercado();

        unidadeDeJoinville.nome = "Joinville";
        unidadeDeJoinville.macasVendidas = 100;
        unidadeDeJoinville.precoMaca = 5.30;
        unidadeDeJoinville.laranjasVendidas = 200;
        unidadeDeJoinville.precoLaranja = 3.50;

        Mercado unidadeDeFlorianopolis = new Mercado();

        unidadeDeFlorianopolis.nome = "Florianopolis";
        unidadeDeFlorianopolis.macasVendidas = 100;
        unidadeDeFlorianopolis.precoMaca = 5.30;
        unidadeDeFlorianopolis.laranjasVendidas = 200;
        unidadeDeFlorianopolis.precoLaranja = 3.50;


    }
}
/*
 * Crie uma classe denominada Mercado.
 * Essa classe terá 5 atributos, as informações que deverão ser guardadas são:
 * • Nome do mercado
 * • Número de maçãs vendidas por ano.
 * • Preço de venda das maçãs.
 * • Número de laranjas vendidas por ano.
 * • Preço de venda das laranjas.
 * Crie 3 objetos da classe Mercado chamados:
 * unidadeDeBlumenau
 * unidadeDeJoinville
 * unidadeDeFlorianopolis
 * Atribua valores a esses objetos
 */