/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabal
 */
import java.util.Random;
import java.util.Scanner;

public class Adivinar {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int num1 = random.nextInt(11);
        int num2 = random.nextInt(11);
        int resultado = num1 * num2;
        while (true) {
            System.out.println("¿Cuánto es " + num1 + " * " + num2 + "?");
            int respuesta = scanner.nextInt();
            if (respuesta == resultado) {
                System.out.println("¡Correcto!");
                break;
            } else {
                System.out.println("Incorrecto. Intenta de nuevo.");
            }
        }
    }
}
