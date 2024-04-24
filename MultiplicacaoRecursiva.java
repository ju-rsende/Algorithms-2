// Escreva um programa em Java que leia dois valores inteiros e imprima o resultado da multiplicação de um pelo outro. 
// A multiplicação deve ser feita através de somas sucessivas recursivas. Por exemplo: 2x3= (2x2x2) = 6

import java.util.Scanner;

public class MultiplicacaoRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor inteiro: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo valor inteiro: ");
        int b = scanner.nextInt();

        int resultado = multiplicacaoRecursiva(a, b);
        System.out.println("O resultado da multiplicação é: " + resultado);

        scanner.close();
    }

    private static int multiplicacaoRecursiva(int a, int b) {
        if (b == 1) {
            return a;
        } else if ((b == 0) || (a == 0)) {
            return 0;
        } else
            return a + multiplicacaoRecursiva(a, b - 1);

    }

}
