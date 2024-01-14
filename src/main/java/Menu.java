/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Sumar dos números\n2. Restar dos números\n3. Multiplicar dos números\n4. Dividir dos números\n5. Salir");
            System.out.println("Elige una opción:");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    // Código para sumar dos números
                    System.out.println("Has seleccionado la opción de sumar dos números.");
                    System.out.println("Introduce el primer número:");
                    int num1 = scanner.nextInt();
                    System.out.println("Introduce el segundo número:");
                    int num2 = scanner.nextInt();
                    System.out.println("La suma de los dos números es: " + (num1 + num2));
                    break;
                case 2:
                    // Código para restar dos números
                    System.out.println("Has seleccionado la opción de restar dos números.");
                    System.out.println("Introduce el minuendo:");
                    int minuendo = scanner.nextInt();
                    System.out.println("Introduce el sustraendo:");
                    int sustraendo = scanner.nextInt();
                    System.out.println("La resta de los dos números es: " + (minuendo - sustraendo));
                    break;
                case 3:
                    // Código para multiplicar dos números
                    System.out.println("Has seleccionado la opción de multiplicar dos números.");
                    System.out.println("Introduce el primer número:");
                    int factor1 = scanner.nextInt();
                    System.out.println("Introduce el segundo número:");
                    int factor2 = scanner.nextInt();
                    System.out.println("El producto de los dos números es: " + (factor1 * factor2));
                    break;
                case 4:
                    // Código para dividir dos números
                    System.out.println("Has seleccionado la opción de dividir dos números.");
                    System.out.println("Introduce el dividendo:");
                    int dividendo = scanner.nextInt();
                    System.out.println("Introduce el divisor:");
                    int divisor = scanner.nextInt();
                    if (divisor != 0) {
                        System.out.println("El cociente de la división es: " + (dividendo / divisor));
                    } else {
                        System.out.println("No se puede dividir por cero.");
                    }
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String salir = scanner.next();
                    if (salir.equalsIgnoreCase("N")) {
                        opcion = 0;  // Si el usuario no quiere salir, reseteamos la opción
                    }
                    break;
                default:
                    System.out.println("Opción no reconocida.");
                    break;
            }
        } while (opcion != 5);
    }
}

