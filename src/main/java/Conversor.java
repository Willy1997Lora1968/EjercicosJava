/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cantidad en euros:");
        double euros = scanner.nextDouble();
        scanner.nextLine(); // consume the newline
        System.out.println("Introduce la moneda a convertir (dólares, yenes, libras):");
        String moneda = scanner.nextLine();
        switch (moneda.toLowerCase()) {
            case "dólares":
                System.out.println(euros + " euros son " + (euros * 1.28611) + " dólares.");
                break;
            case "yenes":
                System.out.println(euros + " euros son " + (euros * 129.852) + " yenes.");
                break;
            case "libras":
                System.out.println(euros + " euros son " + (euros * 0.86) + " libras.");
                break;
            default:
                System.out.println("Moneda no reconocida.");
                break;
        }
    }
}

