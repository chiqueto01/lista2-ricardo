package ex1_metodos;

import java.util.Scanner;

public class Calculadora {
    public static double soma(double a, double b) {
        return a + b;
    }
    
    public static double subtrai(double a, double b) {
        return a - b;
    }
    
    public static double multiplica(double a, double b) {
        return a * b;
    }
    
    public static double divide(double a, double b) {
        return a / b;
    }
    
    public static void executar(Scanner sc) {
        System.out.println("Calculadora Simples");
        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();
        System.out.println("Escolha a operação: 1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão");
        int op = sc.nextInt();
        double resultado = 0;
        switch(op) {
            case 1:
                resultado = soma(n1, n2);
                break;
            case 2:
                resultado = subtrai(n1, n2);
                break;
            case 3:
                resultado = multiplica(n1, n2);
                break;
            case 4:
                if(n2 == 0) {
                    System.out.println("Divisão por zero não é permitida.");
                    return;
                }
                resultado = divide(n1, n2);
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }
        System.out.println("Resultado: " + resultado);
    }
}
