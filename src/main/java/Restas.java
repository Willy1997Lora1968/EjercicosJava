/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class Restas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el dividendo:");
        int dividendo = scanner.nextInt();
        System.out.println("Introduce el divisor:");
        int divisor = scanner.nextInt();
        int cociente = 0;
        while (dividendo >= divisor) {
            dividendo -= divisor;
            cociente++;
        }
        System.out.println("El cociente es: " + cociente);
        System.out.println("El residuo es: " + dividendo);
    }
}
