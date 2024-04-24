// Escreva um programa em Java que leia dois valores inteiros; calcule, através de uma função recursiva, a divisão inteira
// entre eles; e imprima o resultado. A divisão deve ser feita através de subtrações sucessivas recursivas. A divisão inteira
// despreza a parte adicional do resultado, por exemplo: 5/2=2 e 15/4=3.

import java.util.Scanner;

public class DivisaoRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dividendo : ");
        int a = scanner.nextInt();

        System.out.print("Digite o divisor: ");
        int b = scanner.nextInt();

        int resultado = divisaoRecursiva(a, b);
        System.out.println("O resultado da divisão é: " + resultado);

        scanner.close();
    }

    private static int divisaoRecursiva (int a, int b) {
        if (a<b) {
            return 0;
        }
        return 1 + divisaoRecursiva(a - b, b );
    }
}