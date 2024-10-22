package condicional;
public class condicional {
    public double a;
    public double b;
    public static condicional condicional;
    public static double suma(double a, double b ){
        if (a==0){
            System.out.println("El valor de a no puede ser 0");
        }
        return -b/a;
    }
}