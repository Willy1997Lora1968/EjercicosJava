/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class Tiempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un tiempo en minutos:");
        int minutos = scanner.nextInt();
        int dias = minutos / (60 * 24);  // Calcula los días
        minutos %= 60 * 24;  // Obtiene los minutos restantes
        int horas = minutos / 60;  // Calcula las horas
        System.out.println("El tiempo equivalente es: " + dias + " día(s), " + horas + " hora(s)");
    }
}

