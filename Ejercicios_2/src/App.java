import java.util.Scanner;

import condicional.condicional;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la hora (0-23): ");
        int hora = scanner.nextInt();
        condicional.condicional = new condicional();
        String saludo = condicional.horadelDia(hora);
        System.out.println(saludo);
        scanner.close();
    }
}
