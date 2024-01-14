/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class RS232 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;
        String cadena;
        do {
            System.out.println("Introduce una cadena:");
            cadena = scanner.nextLine();
            if (cadena.equals("&&&&&")) {
                break;
            } else if (cadena.length() == 5 && cadena.startsWith("X") && cadena.endsWith("O")) {
                correctas++;
            } else {
                incorrectas++;
            }
        } while (true);
        System.out.println("Lecturas correctas: " + correctas);
        System.out.println("Lecturas incorrectas: " + incorrectas);
    }
}

