package ex1_metodos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 - Calculadora");
            System.out.println("2 - Verificador de Palíndromos");
            System.out.println("3 - Cálculo do Fatorial ");
            System.out.println("4 - Conversor de Temperaturas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch(opcao) {
                case 1:
                    Calculadora.executar(sc);
                    break;
                case 2:
                    Palindromo.executar(sc);
                    break;
                case 3:
                    Fatorial.executar(sc);
                    break;
                case 4:
                    ConversorTemperatura.executar(sc);
                    break;
                case 0:
                    System.out.println("Encerrando Exercício 1.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
        sc.close();
    }
}
