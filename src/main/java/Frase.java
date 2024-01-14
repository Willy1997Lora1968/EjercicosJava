/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class Frase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine();
        System.out.println("La frase en mayúsculas es: " + frase.toUpperCase());
        System.out.println("La frase en minúsculas es: " + frase.toLowerCase());
    }
}

