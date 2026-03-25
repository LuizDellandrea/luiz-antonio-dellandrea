package Orientacao_e_Objeto.Exer12;


    public class InteiroPositivo {

    private int x;

    public void setValor(int valor) {
        if (valor > 0) {
            x = valor;
        } else {
            System.out.println("Valor inválido");
        }
    }

    public int getValor() {
        return x;
    }

    public int fatorial() {
        int resultado = 1;

        for (int i = 1; i <= x; i++) {
            resultado = resultado * i;
        }

        return resultado;
    }

    public void divisores() {
        int quantidade = 0;

        System.out.print("Divisores: ");

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.print(i + " ");
                quantidade++;
            }
        }

        System.out.println("\nQuantidade: " + quantidade);
    }

    public void fibonacci() {
        int a = 1;
        int b = 1;

        System.out.print("Fibonacci: ");

        for (int i = 1; i <= x; i++) {
            System.out.print(a + " ");

            int temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println();
    }
}

