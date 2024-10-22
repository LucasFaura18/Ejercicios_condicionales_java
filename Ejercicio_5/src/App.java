import java.util.Scanner;
import condicional.condicional;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.println("Introduce el valor de a: ");
        double a = scanner.nextDouble();
        System.out.println("Introduce el valor de b: ");
        double b = scanner.nextDouble();
        condicional.condicional = new condicional();
        double solucion = condicional.suma(a, b);
        System.out.printf("x = "+solucion);
        scanner.close();

    }
}
