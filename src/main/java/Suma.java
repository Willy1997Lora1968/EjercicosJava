import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el segundo número:");
        int num2 = scanner.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los dos números es: " + suma);
    }
}
