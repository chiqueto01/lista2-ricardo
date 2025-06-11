package ex1_metodos;

import java.util.Scanner;

public class ConversorTemperatura {
    public static double celsiusToFahrenheit(double c) {
        return (c * 9.0 / 5) + 32;
    }
    
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5.0 / 9;
    }
    
    public static void executar(Scanner sc) {
        System.out.println("Conversor de Temperaturas");
        System.out.println("Escolha a conversão: 1 - Celsius para Fahrenheit, 2 - Fahrenheit para Celsius");
        int op = sc.nextInt();
        System.out.print("Digite a temperatura: ");
        double temp = sc.nextDouble();
        switch(op) {
            case 1:
                System.out.println(temp + "°C equivale a " + celsiusToFahrenheit(temp) + "°F");
                break;
            case 2:
                System.out.println(temp + "°F equivale a " + fahrenheitToCelsius(temp) + "°C");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
