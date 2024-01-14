/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class CantidadNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        int num = scanner.nextInt();
        int digitos = (int) Math.log10(Math.abs(num)) + 1;
        System.out.println("El número tiene " + digitos + " dígitos.");
    }
}
