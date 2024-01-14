/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cabal
 */
public class Variables {
    public static void main(String[] args) {
        int A = 1, B = 2, C = 3, D = 4;
        System.out.println("Valores iniciales: A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);
        int aux = A;  // Variable auxiliar
        A = D;
        D = B;
        B = C;
        C = aux;
        System.out.println("Valores finales: A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);
    }
}
