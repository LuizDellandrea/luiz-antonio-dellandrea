package Orientacao_e_Objeto.Exer3;

public class ProdutoPOO {

    public static void main(String[] args) {

        Produto p1 = new Produto();

        p1.nome = "Caderno";
        p1.descricao = "Caderno em espiral tamanho medio";
        p1.precoUnitario = 4.50;
        p1.desconto = 15;

        Produto p2 = new Produto();

        p2.nome = "Caneta ESF";
        p2.descricao = "Caneta esferografica 5mm";
        p2.precoUnitario = 1.20;
        p2.desconto = 2;

        Produto p3 = new Produto();

        p3.nome = "Esquadro";
        p3.descricao = "Esquadro de acrilico 20 cm";
        p3.precoUnitario = 2.35;
        p3.desconto = 10;
    }
}
/*
 * A partir das representações abaixo dos objetos de uma classe Produto, escreva
 * o código
 * necessário para suportar tais objetos.
 * Ou seja, o código necessário para criar a classe e instanciar os objetos de
 * modo que fiquem
 * com o estado apresentado.
 * 
 * 
 * produto1: Produto
 * nome = “Caderno”
 * descricao = “Caderno em espiral tamanho médio”
 * precoUnitario = 4.50
 * desconto = 15
 * 
 * 
 * produto2: Produto
 * nome = “Caneta ESF”
 * descricao = “Caneta esferográfica 5mm”
 * precoUnitario = 1.20
 * desconto = 2
 * produto3: Produto
 * nome = “Esquadro”
 * descricao = “Esquadro de acrílico 20 cm”
 * precoUnitario = 2.35
 * desconto = 10
 */