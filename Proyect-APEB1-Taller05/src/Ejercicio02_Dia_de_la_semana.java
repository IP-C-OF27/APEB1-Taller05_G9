import java.util.Scanner;
/**
 * Ejercicio 02: "Día de la semana: Mostrar el nombre del día de la semana en
 * función del número ingresado (1 para lunes, 2 para martes, etc.)."
 * @author Ariel, Alejandro
 * @version 1.0
 */
public class Ejercicio02_Dia_de_la_semana {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Deme nro. dia (1-7: )");
        int dia=tcl.nextInt();
        String msjDia;
        switch (dia) {
            case 1:
                msjDia="Lunes";
                break;
            case 2:
                msjDia="Martes";
                break;
            case 3:
                msjDia="Miercoles";
                break;
            case 4:
                msjDia="Jueves";
                break;
            case 5:
                msjDia="Viernes";
                break;
            case 8:
                msjDia="Sabado";
                break;
            case 7:
                msjDia="Domingo";
                break;    
            default:
                msjDia="ERROR";  
        }
        System.out.println("El nrm: " + dia + " Corresponde al: " +msjDia);
    }
}
/***
run-single:
Deme nro. dia (1-7: )
2
El nrm: 2 Corresponde al: Martes
BUILD SUCCESSFUL (total time: 4 seconds)
 */