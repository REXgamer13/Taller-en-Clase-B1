//import java.util.Calendar;
//import java.util.GregorianCalendar;


public class metodo_Persona {

    //metodo persona 
    /*Persona: Metodo que permita conocer la cantidad de años, meses y dia de vida. */
    


    public String tiempo(int dia_Actual, int mes_Actual, int año_Actual,int dia_Nacimiento, int mes_nacimeinto , int año_nacimineto){

        int tiempo_dia = (dia_Actual-dia_Nacimiento);
        int tiempo_mes =(mes_Actual-mes_nacimeinto);
        int tiempo_año =(año_Actual-año_nacimineto);

        String tiempo = "El tiempo de vida de la persona es de: "+tiempo_año+" años " + tiempo_mes + "meses " + tiempo_dia + " dias ";

        return tiempo;
    }

    public static void main(String[] args) {

    /*        fecha actual
    
    Calendar c = new GregorianCalendar();
    
    int dia_Actual = (c.get(Calendar.DATE));
    int mes_Actual = (c.get(Calendar.MONTH)+1);
    int año_Actual = (c.get(Calendar.YEAR));
    

    System.out.println(dia_Actual);
    System.out.println(mes_Actual);
    System.out.println(año_Actual);

    */


    }


}
