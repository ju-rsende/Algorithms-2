//Crie um método recursivo que receba uma string e retorne true se a mesma for composta somente por vogais.
//Crie outro método recursivo que receba uma string e retorne true se a mesma for composta somente por consoantes.
//Crie um terceiro método recursivo que receba uma string e retorne true se a mesma corresponder a um número inteiro.
//Crie um quarto método recursivo que receba uma string e retorne true se a mesma corresponder a um número real.
//Na saída padrão, para cada linha de entrada, escreva outra de saída da seguinte forma X1 X2 X3 X4 onde cada Xi é um
//booleano indicando se a entrada é: composta somente por vogais (X1); composta somente por consoantes (X2); um
//número inteiro (X3); um número real (X4). Se Xi for verdadeiro, seu valor deveráser SIM; caso contrário, NAO.

import java.util.Scanner;

public class IsRecursivo {

    public static boolean verificaVogais(String str) {
        return verificaVogaisRecursivo(str.toLowerCase(), 0);
    }

    private static boolean verificaVogaisRecursivo(String str, int i) {
        if (i == str.length()) {
            return true;
        }
        char currentChar = str.charAt(i);
        if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||
                currentChar == 'o' || currentChar == 'u') {
            return verificaVogaisRecursivo(str, i + 1);
        }
        return false;
    }

    public static boolean verificaConsoantes(String str) {
        return verificaConsoantesRecursivo(str.toLowerCase(), 0);
    }

    private static boolean verificaConsoantesRecursivo(String str, int i) {
        if (i == str.length()) {
            return true;
        }
        char currentChar = str.charAt(i);
        if (currentChar >= 'a' && currentChar <= 'z' && currentChar != 'a' &&
                currentChar != 'e' && currentChar != 'i' && currentChar != 'o' &&
                currentChar != 'u') {
            return verificaConsoantesRecursivo(str, i + 1);
        }
        return false;
    }

    public static boolean verificaInteiro(String str) {
        return verificaInteiroRecursivo(str, 0);
    }

    private static boolean verificaInteiroRecursivo(String str, int i) {
        if (i == str.length()) {
            return true;
        }
        char currentChar = str.charAt(i);
        if (currentChar >= '0' && currentChar <= '9') {
            return verificaInteiroRecursivo(str, i + 1);
        }
        return false;
    }

    public static boolean verificaReal(String str) {
        return verificaRealRecursivo(str, 0, false);
    }

    private static boolean verificaRealRecursivo(String str, int i, boolean eDecimal) {
        if (i == str.length()) {
            return eDecimal;
        }
        char currentChar = str.charAt(i);
        if ((currentChar >= '0' && currentChar <= '9') || currentChar == '.') {
            if (currentChar == '.') {
                if (eDecimal) {
                    return false;
                }
                return verificaRealRecursivo(str, i + 1, true);
            }
            return verificaRealRecursivo(str, i + 1, eDecimal);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String entrada = scanner.nextLine().trim();

            if (entrada.equals("FIM")) {
                break;
            }

            boolean vogais = verificaVogais(entrada);
            boolean consoantes = verificaConsoantes(entrada);
            boolean inteiro = verificaInteiro(entrada);
            boolean real = verificaReal(entrada);

            System.out.println((vogais ? "SIM" : "NAO") + " " + (consoantes ? "SIM" : "NAO") + " " +
            (inteiro ? "SIM" : "NAO") + " " + (real ? "SIM" : "NAO"));

        }

        scanner.close();
    }
}
