import java.util.Scanner;
import java.util.Random;

public class Aleatoria {
    public static void main(String[] args) {
        Scanner aleat = new Scanner(System.in);
        String entrada = aleat.nextLine();

        Random generator = new Random();
        generator.setSeed(4);

        for (; !entrada.equals("FIM"); entrada = aleat.nextLine()) {
            int primeiraLetra = 'a' + (Math.abs(generator.nextInt()) % 26);
            char letraUm = (char) primeiraLetra;

            int segundaLetra = 'a' + (Math.abs(generator.nextInt()) % 26);
            char letraDois = (char) segundaLetra;

            System.out.println(randomizar(entrada, letraUm, letraDois));
        }
    }

    public static String randomizar(String texto, char letraAntiga, char novaLetra) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == letraAntiga) {
                builder.append(novaLetra);
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
