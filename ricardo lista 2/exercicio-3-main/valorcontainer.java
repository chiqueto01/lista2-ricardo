package ex3_objetos;

import java.util.Scanner;

public class ValorContainer {
    private int valor;
    
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public int getValor() {
        return valor;
    }
    
    public static void trocarValores(ValorContainer a, ValorContainer b) {
        int temp = a.valor;
        a.valor = b.valor;
        b.valor = temp;
    }
    
    public static void executar(Scanner sc) {
        System.out.println("Trocar Valores entre Objetos (ValorContainer)");
        ValorContainer objA = new ValorContainer();
        ValorContainer objB = new ValorContainer();
        System.out.print("Digite um valor para objA: ");
        objA.setValor(sc.nextInt());
        System.out.print("Digite um valor para objB: ");
        objB.setValor(sc.nextInt());
        System.out.println("Antes da troca: objA = " + objA.getValor() + ", objB = " + objB.getValor());
        trocarValores(objA, objB);
        System.out.println("Após a troca: objA = " + objA.getValor() + ", objB = " + objB.getValor());
    }
}
