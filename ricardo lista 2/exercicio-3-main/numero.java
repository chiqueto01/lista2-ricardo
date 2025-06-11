package ex3_objetos;

import java.util.Scanner;

public class Numero {
    private int valor;
    
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void imprimirValor() {
        System.out.println("Valor: " + valor);
    }
    
    public static void executar(Scanner sc) {
        System.out.println("Manipulação de Objeto (Numero)");
        Numero num = new Numero();
        System.out.print("Digite um valor inteiro: ");
        num.setValor(sc.nextInt());
        sc.nextLine(); 
        num.imprimirValor();
        System.out.println("HashCode: " + System.identityHashCode(num));
    }
}
