package ex2_arrays;

import java.util.Scanner;

public class ArrayOperations {
    public static void encontrarMaiorMenor(Scanner sc) {
        System.out.println("Maior e Menor Elemento em uma Matriz");
        System.out.print("Digite o número de linhas: ");
        int m = sc.nextInt();
        System.out.print("Digite o número de colunas: ");
        int n = sc.nextInt();
        int[][] matriz = new int[m][n];
        System.out.println("Preencha a matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        int maior = matriz[0][0];
        int menor = matriz[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);
    }
    
    public static void somarDiagonais(Scanner sc) {
        System.out.println("Soma das Diagonais de uma Matriz Quadrada");
        System.out.print("Digite a ordem da matriz (n): ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        System.out.println("Preencha a matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        int somaPrincipal = 0;
        int somaSecundaria = 0;
        for (int i = 0; i < n; i++) {
            somaPrincipal += matriz[i][i];
            somaSecundaria += matriz[i][n - 1 - i];
        }
        System.out.println("Soma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaSecundaria);
    }
}
