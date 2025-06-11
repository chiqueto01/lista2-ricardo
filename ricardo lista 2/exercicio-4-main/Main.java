package ex4_classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 - Sistema de Gerenciamento de Funcionários");
            System.out.println("2 - Agenda de Contatos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch(opcao) {
                case 1:
                    EmployeeManager.executar(sc);
                    break;
                case 2:
                    ContactAgenda.executar(sc);
                    break;
                case 0:
                    System.out.println("Encerrando Exercício 4.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
        sc.close();
    }
}

class ContactAgenda {
    public static void executar(Scanner sc) {
        System.out.println("Agenda de Contatos em execução...");
    }
}
