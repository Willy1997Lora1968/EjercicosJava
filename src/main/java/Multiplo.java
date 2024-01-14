import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int pares = 0;
        int impares = 0;
        while (true) {
            System.out.println("Introduce un número entero:");
            int num = scanner.nextInt();
            if (num % 5 == 0) {
                break;
            }
            if (num >= 0) {
                contador++;
                if (num % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }
        System.out.println("Cantidad de números leídos: " + contador);
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
}
