package ex1_metodos;

import java.util.Scanner;

public class Palindromo {
    public static boolean ehPalindromo(String texto) {
        String str = texto.replaceAll("\\s+", "").toLowerCase();
        String reverso = new StringBuilder(str).reverse().toString();
        return str.equals(reverso);
    }
    
    public static void executar(Scanner sc) {
        System.out.println("Verificador de Palíndromos");
        System.out.print("Digite uma palavra ou frase: ");
        String texto = sc.nextLine();
        if(ehPalindromo(texto))
            System.out.println("É palíndromo!");
        else
            System.out.println("Não é palíndromo.");
    }
}
