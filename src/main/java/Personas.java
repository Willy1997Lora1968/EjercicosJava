/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabal
 */

import java.util.Scanner;

public class Personas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;
        do {
            System.out.println("Introduce el nombre:");
            String nombre = scanner.nextLine();
            System.out.println("Introduce la edad:");
            int edad = scanner.nextInt();
            scanner.nextLine(); // consume the newline
            System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", " + (edad >= 18 ? "Mayor de edad" : "Menor de edad"));
            System.out.println("¿Quieres seguir mostrando personas? (Sí/No)");
            continuar = scanner.nextLine();
        } while (!continuar.equalsIgnoreCase("No"));
    }
}
