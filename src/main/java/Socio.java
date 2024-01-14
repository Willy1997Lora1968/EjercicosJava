/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabal
 */
import java.util.Scanner;


public class Socio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el tipo de socio (A, B, C):");
        String tipo = scanner.next();
        System.out.println("Introduce el costo del tratamiento:");
        double costo = scanner.nextDouble();
        switch (tipo.toUpperCase()) {
            case "A": costo *= 0.5; break;  // Descuento del 50%
            case "B": costo *= 0.65; break;  // Descuento del 35%
            case "C": break;  // Sin descuento
            default: System.out.println("Tipo de socio no reconocido."); return;
        }
        System.out.println("El importe a pagar por el socio es: " + costo);
    }
}
