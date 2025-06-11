package ex2_arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 - Encontrar Maior e Menor Elemento em uma Matriz");
            System.out.println("2 - Somar Diagonais de uma Matriz Quadrada");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            switch(opcao) {
                case 1:
                    ArrayOperations.encontrarMaiorMenor(sc);
                    break;
                case 2:
                    ArrayOperations.somarDiagonais(sc);
                    break;
                case 0:
                    System.out.println("Encerrando Exercício 2.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while(opcao != 0);
        sc.close();
    }
}
