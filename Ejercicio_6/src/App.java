import condicional.condicional;
import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduzca la altura (en metros) desde la que cae el objeto: ");
        double h = scanner.nextDouble();
        condicional.condicional = new condicional();
        double solucion = condicional.formula(h);
        System.out.printf("El objeto tarda "+solucion+"s en caer");
        scanner.close();
    }
}
