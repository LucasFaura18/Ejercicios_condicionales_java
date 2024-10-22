package condicional;

public class condicional{
    public static double a;
    public static double b;
    public static double c;
    public static double[] solucion = new double[2];
    public static double fase = (b*b)-(4*a*c);
    public static condicional condicional;
    public static double[] formula(double a, double b, double c){
        if(a==0 && b==0 && c==0){
            System.out.println("La ecuacion tiene soluciones infinitas");
        } else if(a==0 && b==0){
        System.out.println("La ecuacion no tiene solución");
        } else if (fase>0){
            solucion[0] = (-b + Math.sqrt(fase))/(2*a);
            solucion[1] = (-b - Math.sqrt(fase))/(2*a);
        } else if (fase == 0){
            solucion[0] = solucion[1] = (-b/(2*a));
        }
        return solucion;
        }
        
    }
