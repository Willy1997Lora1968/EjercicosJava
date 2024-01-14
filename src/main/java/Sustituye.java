/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabal
 */
public class Sustituye {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.print((i == 3 ? "E" : i) + "-");
                    System.out.print((j == 3 ? "E" : j) + "-");
                    System.out.println(k == 3 ? "E" : k);
                }
            }
        }
    }
}
