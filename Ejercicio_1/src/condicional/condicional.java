package condicional;

public class condicional{
    public String obtenerAsignatura(String dia){
        String asignatura;
        dia = dia.toLowerCase();
        switch (dia) {
            case "lunes":
                asignatura = "Programacion";
                break;
            case "martes":
                asignatura = "IPE";
                break;
            case "miercoles":
                asignatura = "Programacion";
                break;
            case "jueves":
                asignatura = "Lenguaje de Marcas";
                break;
            case "viernes":
                asignatura = "Lenguaje de Marcas";
                break;
            default:
                asignatura = "Día no válido";
                break;
        }

        return asignatura;
        }
        
    
}

