package condicional;

public class condicional{
    public double h;
    public static condicional condicional;
    public static double formula(double h){
        if(h<0){
            System.out.println("El valor h debe ser positivo");
        } 
            double g = 9.81;
            return Math.sqrt(2*h/g);
        }
        
    }
