import java.util.Scanner;
import Condicional.condicional;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 7: ");
        int numero = scanner.nextInt();
        condicional.condicional = new condicional();
        String dia = condicional.diadelaSemana(numero);
        System.out.print(dia);
        scanner.close();

    }
}
