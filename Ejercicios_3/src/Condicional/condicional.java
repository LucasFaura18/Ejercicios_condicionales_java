package Condicional;

public class condicional {
    public static condicional condicional;

    public static String diadelaSemana(int numero){
        String eleccion;
        switch (numero) {
            case 1:
                eleccion = "Lunes";
                break;
            case 2:
                eleccion = "Martes";
                break;
            case 3:
                eleccion = "Miércoles";
                break;
            case 4:
                eleccion = "Jueves";
                break;
            case 5:
                eleccion = "Viernes";
                break;
            case 6:
                eleccion = "Sábado";
                break;
            case 7:
                eleccion = "Domingo";
                break;
            default:
                eleccion = "Número no válido";
                break;
        }
        return eleccion;
        }
}

