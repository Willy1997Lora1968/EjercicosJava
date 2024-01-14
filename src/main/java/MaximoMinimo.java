/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class MaximoMinimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número de números:");
        int N = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double suma = 0;
        int i = 0;
        while (i < N) {
            System.out.println("Introduce el número " + (i + 1) + ":");
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            suma += num;
            i++;
        }
        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);
        System.out.println("El promedio es: " + (suma / N));
    }
}
