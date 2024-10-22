package condicional;

public class condicional {

    public static condicional condicional;

    public static String horadelDia(int hora){
        String momento;
        if( hora>=6  &&  hora < 13){
            momento = "Buenos Días";
        } else if( hora>=13  &&  hora <= 20){
            momento = "Buenas Tardes";
        } else{
            momento = "Buenas Noches";
            }
            return momento;
        }
}