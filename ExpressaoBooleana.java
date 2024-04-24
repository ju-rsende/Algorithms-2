import java.util.Scanner;

public class ExpressaoBooleana {

    public static int avaliarExpressao(String expressao, int[] valores) {
        return avaliarExpressao(expressao, valores, 0);
    }

    private static int avaliarExpressao(String expressao, int[] valores, int index) {
        if (expressao.length() == 1) {
            return valores[Integer.parseInt(expressao)];
        }

        if (index >= expressao.length()) {
            return 0;
        }

        char operador = expressao.charAt(index);
        if (operador == '&' || operador == '|' || operador == '^') {
            int nextOperatorIndex = expressao.indexOf('&', index + 1);
            if (nextOperatorIndex == -1) {
                nextOperatorIndex = expressao.indexOf('|', index + 1);
            }
            if (nextOperatorIndex == -1) {
                nextOperatorIndex = expressao.indexOf('^', index + 1);
            }
            if (nextOperatorIndex == -1) {
                nextOperatorIndex = expressao.length() - 1;
            }

            int resultadoEsquerda = valores[Integer.parseInt(String.valueOf(expressao.charAt(index - 1)))];
            int resultadoDireita = valores[Integer.parseInt(String.valueOf(expressao.charAt(index + 1)))];
            if (operador == '&') {
                return resultadoEsquerda & resultadoDireita;
            } else if (operador == '|') {
                return resultadoEsquerda | resultadoDireita;
            } else {
                return resultadoEsquerda ^ resultadoDireita;
            }
        } else {
            return avaliarExpressao(expressao, valores, index + 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a expressão booleana e os valores das entradas (ou 'FIM' para encerrar):");

        while (true) {
            String entrada = scanner.nextLine().trim();

            if (entrada.equals("FIM")) {
                break;
            }

            String[] partes = entrada.split(" ");
            int n = Integer.parseInt(partes[0]);
            int[] valores = new int[n];

            for (int i = 0; i < n; i++) {
                valores[i] = Integer.parseInt(String.valueOf(partes[1].charAt(i)));
            }

            int resultado = avaliarExpressao(partes[2], valores);
            System.out.println(resultado);
        }

        scanner.close();
    }
}

