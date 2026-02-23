public class oitavo {
    public static void main(String[] args) {

        int[][] matriz = {
            {210, 3, 399900},
            {160, 3, 329900},
            {240, 3, 369000},
            {141, 2, 232000},
            {300, 4, 539900},
            {198, 4, 299900},
            {153, 3, 314900},
            {142, 3, 199000},
            {138, 3, 212000},
            {149, 3, 242500},
            {194, 4, 240000},
            {200, 3, 347000},
            {189, 3, 330000},
            {447, 5, 699900},
            {126, 3, 259900}
        };

        double somadosprecos = 0;
        int menortamanho = matriz[0][0];
        int menor = matriz[0][2];

        int maiorquartos = matriz[0][1];
        int menorquartos = matriz[0][1];
        int tamanhomaiorquartos = matriz[0][0];
        int tamanhomenorquartos = matriz[0][0];

        double somatamanhomaior300 = 0;
        int contadormaior300 = 0;

        for (int i = 0; i < matriz.length; i++) {

            // a) Média dos preços
            somadosprecos += matriz[i][2];

            // b) Menor casa (por tamanho)
            if (matriz[i][0] < menortamanho) {
                menortamanho = matriz[i][0];
                menor = matriz[i][2];
            }

            // c) Maior e menor número de quartos
            if (matriz[i][1] > maiorquartos) {
                maiorquartos = matriz[i][1];
                tamanhomaiorquartos = matriz[i][0];
            }

            if (matriz[i][1] < menorquartos) {
                menorquartos = matriz[i][1];
                tamanhomenorquartos = matriz[i][0];
            }

            // d) Casas com preço > 300000
            if (matriz[i][2] > 300000) {
                somatamanhomaior300 += matriz[i][0];
                contadormaior300++;
            }
        }

        double mediaprecos = somadosprecos / matriz.length;
        int diferencatamanho = tamanhomaiorquartos - tamanhomenorquartos;
        double mediatamanhomaior300 = somatamanhomaior300 / contadormaior300;

        System.out.println("a) Média dos preços: " + mediaprecos);
        System.out.println("b) Preço da menor casa (" + menortamanho + "m²): " + menor);
        System.out.println("c) Diferença de tamanho (maior quartos - menor quartos): " + diferencatamanho);
        System.out.println("d) Média do tamanho das casas acima de 300.000: " + mediatamanhomaior300);
    }
}


