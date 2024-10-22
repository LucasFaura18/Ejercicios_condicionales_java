import java.util.Scanner;
import condicional.condicional;
public class App {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de segundo grado: ax^2 + bx + c = 0");
        System.out.println("Introduce el valor de a: ");
        double a = scanner.nextDouble();
        System.out.println("Introduce el valor de b: ");
        double b = scanner.nextDouble();
        System.out.println("Introduce el valor de c: ");
        double c = scanner.nextDouble();
        condicional.condicional = new condicional();
        double[] resultado = condicional.formula(a, b, c);
        if (resultado[0] != resultado[1]){
            System.out.printf("Las soluciones de la ecuacion son: x1 = "+ resultado[0]+" x2 = "+ resultado[1]);
        } else {
            System.out.printf("La unica solucion de la ecuacion es: x = "+ resultado[0]);
        }
        scanner.close();
    }
}
