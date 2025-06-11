package ex4_classes;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
    private static ArrayList<Employee> employees = new ArrayList<>();
    
    public static void executar(Scanner sc) {
        int opcao;
        do {
            System.out.println("\nSistema de Gerenciamento de Funcionários");
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Calcular Total de Salários de um Departamento");
            System.out.println("3 - Listar Funcionários");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch(opcao) {
                case 1:
                    cadastrarFuncionario(sc);
                    break;
                case 2:
                    calcularSalariosDepartamento(sc);
                    break;
                case 3:
                    listarFuncionarios();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }
    
    private static void cadastrarFuncionario(Scanner sc) {
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("ID: ");
        int id = sc.nextInt();
        System.out.print("Salário: ");
        double salario = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Departamento: ");
        String departamento = sc.nextLine();
        employees.add(new Employee(nome, id, salario, departamento));
    }
    
    private static void calcularSalariosDepartamento(Scanner sc) {
        System.out.print("Digite o departamento: ");
        String dept = sc.nextLine();
        double total = 0;
        for (Employee emp : employees) {
            if(emp.getDepartamento().equalsIgnoreCase(dept)) {
                total += emp.getSalario();
            }
        }
        System.out.println("Total de salários no departamento " + dept + ": R$ " + total);
    }
    
    private static void listarFuncionarios() {
        System.out.println("Lista de Funcionários:");
        for(Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
