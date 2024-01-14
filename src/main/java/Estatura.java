/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class Estatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número de personas:");
        int N = scanner.nextInt();
        double suma = 0;
        double sumaBajo = 0;
        int contadorBajo = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Introduce la altura de la persona " + (i + 1) + ":");
            double altura = scanner.nextDouble();
            suma += altura;
            if (altura < 1.60) {
                sumaBajo += altura;
                contadorBajo++;
            }
        }
        System.out.println("El promedio de estaturas en general es: " + (suma / N));
        if (contadorBajo > 0) {
            System.out.println("El promedio de estaturas que se encuentran por debajo de 1.60 mts. es: " + (sumaBajo / contadorBajo));
        } else {
            System.out.println("No hay estaturas que se encuentren por debajo de 1.60 mts.");
        }
    }
}
