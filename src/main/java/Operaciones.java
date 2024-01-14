/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el segundo número:");
        int num2 = scanner.nextInt();
        System.out.println("Elige la operación a realizar: suma, resta, multiplicación, división");
        String operacion = scanner.next();
        switch (operacion) {
            case "suma":
                System.out.println("La suma es: " + (num1 + num2));
                break;
            case "resta":
                System.out.println("La resta es: " + (num1 - num2));
                break;
            case "multiplicación":
                System.out.println("La multiplicación es: " + (num1 * num2));
                break;
            case "división":
                if (num2 != 0) {
                    System.out.println("La división es: " + (num1 / num2));
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Operación no reconocida.");
                break;
        }
    }
}
