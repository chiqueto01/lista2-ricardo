package ex4_classes;

public class Employee {
    private String nome;
    private int id;
    private double salario;
    private String departamento;
    
    public Employee(String nome, int id, double salario, String departamento) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        this.departamento = departamento;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    
    public double getSalario() {
        return salario;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + ", ID: " + id + ", Salário: " + salario + ", Departamento: " + departamento;
    }
}
