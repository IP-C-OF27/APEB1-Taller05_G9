
import java.util.Scanner;

/**
 * Ejercicio 05: "Año Bisiesto: Comprobar si un año ingresado es bisiesto o no.
 * Si es bisiesto, mostrar un mensaje especial."
 * @author Alejandro, Ariel
 * @version 1.0
 */

public class Ejercicio05_Año_Bisiesto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingresar anio: ");
        int anio=tcl.nextInt();
        if (anio%4==0){
            System.out.println("Es anio bisiesto");
        }else{
            System.out.println("No es bisiesto");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingresar anio: 2026
No es bisiesto
BUILD SUCCESSFUL (total time: 4 seconds)
 */