
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabal
 */
public class NumerosFamilias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de familias:");
        int N = scanner.nextInt();
        double suma = 0;
        int contador = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Introduce la cantidad de hijos de la familia " + (i + 1) + ":");
            int M = scanner.nextInt();
            for (int j = 0; j < M; j++) {
                System.out.println("Introduce la edad del hijo " + (j + 1) + ":");
                int edad = scanner.nextInt();
                suma += edad;
                contador++;
            }
        }
        System.out.println("La media de edad de los hijos de todas las familias es: " + (suma / contador));
    }
}
