/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una temperatura en grados centígrados:");
        double celsius = scanner.nextDouble();
        double fahrenheit = 32 + (9 * celsius / 5);
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
    }
}

