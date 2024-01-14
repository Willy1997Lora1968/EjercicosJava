/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class Romano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entre 1 y 10:");
        int num = scanner.nextInt();
        switch (num) {
            case 1: System.out.println("El número en romano es: I"); break;
            case 2: System.out.println("El número en romano es: II"); break;
            case 3: System.out.println("El número en romano es: III"); break;
            case 4: System.out.println("El número en romano es: IV"); break;
            case 5: System.out.println("El número en romano es: V"); break;
            case 6: System.out.println("El número en romano es: VI"); break;
            case 7: System.out.println("El número en romano es: VII"); break;
            case 8: System.out.println("El número en romano es: VIII"); break;
            case 9: System.out.println("El número en romano es: IX"); break;
            case 10: System.out.println("El número en romano es: X"); break;
            default: System.out.println("El número no está en el rango de 1 a 10."); break;
        }
    }
}

