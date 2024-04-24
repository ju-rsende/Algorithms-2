import java.util.Scanner;
import java.util.Random;

public class CiframentoDeCesar {
    public static void main(String[] args) {
        Scanner cifrar = new Scanner(System.in);
        String entrada = cifrar.nextLine();

        Random generator = new Random();
        generator.setSeed(4);

        for (; !entrada.equals("FIM"); entrada = cifrar.nextLine()) {
            int primeiraLetra = 'a' + (Math.abs(generator.nextInt()) % 26);
            char primeira = (char) primeiraLetra;

            int segundaLetra = 'a' + (Math.abs(generator.nextInt()) % 26);
            char segunda = (char) segundaLetra;

            System.out.println(randomizar(entrada, primeira, segunda));
        }
    }

    public static String randomizar(String texto, char letraAntiga, char novaLetra) {
        return randomizar(texto, letraAntiga, novaLetra, 0);
    }

    private static String randomizar(String texto, char letraAntiga, char novaLetra, int i) {
        if (i == texto.length()) {
            return "";
        } else {
            if (texto.charAt(i) == letraAntiga) {
                return novaLetra + randomizar(texto, letraAntiga, novaLetra, i + 1);
            } else {
                return texto.charAt(i) + randomizar(texto, letraAntiga, novaLetra, i + 1);
            }
        }
    }
}
