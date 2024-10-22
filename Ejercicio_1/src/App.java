import java.util.Scanner;

import condicional.condicional;
public class App {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("introduzca un dia de la semana: ");
    String dia = scanner.nextLine().toLowerCase();
    condicional condicional = new condicional();
    String resultado = condicional.obtenerAsignatura(dia);
    System.out.println("La asignatura a primera hora es: " + resultado);
    scanner.close();
    }
}
