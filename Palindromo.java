import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        while (!input.equals("FIM")) {
            if (ehPalindromo(input)) {
                System.out.println("SIM");
            } else {
                System.out.println("NAO");
            }
            input = scanner.nextLine();
        }
        scanner.close();
    }

    public static boolean ehPalindromo(String palavra) {
        int contador = 0;
        return ehPalindromoRecursivo(palavra.toLowerCase(), contador);
    }

    private static boolean ehPalindromoRecursivo(String palavra, int contador) {
        if (contador >= palavra.length() / 2) {
            return true;
        }
        if (palavra.charAt(contador) != palavra.charAt(palavra.length() - contador - 1)) {
            return false;
        }
        return ehPalindromoRecursivo(palavra, contador + 1);
    }
}

