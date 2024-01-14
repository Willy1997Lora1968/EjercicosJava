/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class Calculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        int num = scanner.nextInt();
        System.out.println("El doble del número es: " + (num * 2));
        System.out.println("El triple del número es: " + (num * 3));
        System.out.println("La raíz cuadrada del número es: " + Math.sqrt(num));
    }
}

