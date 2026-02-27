package metodos;

public class RockTa {

    public static final String VERDE = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) throws InterruptedException {

        // Controle de velocidade
        int velocidadeDigitacao = 75; // quanto maior, mais lento
        int[] pausas = {
            600, 500, 700, 800, 800, 680, 700,
            800, 690, 350, 500, 300, 490, 350
        };

        String[] frases = {
            "I wanna da-",
            "I wanna dance in the lights",
            "I wanna ro-",
            "I wanna rock your body",
            "I wanna go",
            "I wanna go for a ride",
            "Hop in the music and",
            "Rock your body",
            "Rock that body",
            "come on, come on",
            "Rock that body",
            "(Rock your body)",
            "Rock that body",
            "come on, come on"
        };

        System.out.print(VERDE);

        for (int i = 0; i < frases.length; i++) {

            for (char c : frases[i].toCharArray()) {
                System.out.print(c);
                Thread.sleep(velocidadeDigitacao);
            }

            System.out.println();
            Thread.sleep(pausas[i]);
        }

        System.out.print(RESET);
    }
}