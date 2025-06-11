package ex3_objetos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 - Manipular Dados de um Objeto )");
            System.out.println("2 - Trocar Valores entre Objetos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            switch(opcao) {
                case 1:
                    Numero.executar(sc);
                    break;
                case 2:
                    ValorContainer.executar(sc);
                    break;
                case 0:
                    System.out.println("Encerrando Exercício 3.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
        sc.close();
    }
}
