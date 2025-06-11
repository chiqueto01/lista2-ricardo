package ex1_metodos;

import java.util.Scanner;

public class Fatorial {
    public static long fatorial(int n) {
        if(n == 0 || n == 1)
            return 1;
        return n * fatorial(n - 1);
    }
    
    public static void executar(Scanner sc) {
        System.out.println("Cálculo do Fatorial (Recursivo)");
        System.out.print("Digite um número inteiro não negativo: ");
        int n = sc.nextInt();
        if(n < 0) {
            System.out.println("Número negativo não é permitido.");
            return;
        }
        long fat = fatorial(n);
        System.out.println("Fatorial de " + n + " é " + fat);
    }
}
