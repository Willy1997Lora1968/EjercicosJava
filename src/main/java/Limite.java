/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class Limite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un valor límite positivo:");
        int limite = scanner.nextInt();
        int suma = 0;
        while (suma <= limite) {
            System.out.println("Introduce un número:");
            int num = scanner.nextInt();
            suma += num;
        }
        System.out.println("La suma de los números introducidos supera el límite inicial.");
    }
}

