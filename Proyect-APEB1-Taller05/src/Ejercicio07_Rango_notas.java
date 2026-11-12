
import java.util.Scanner;

/**
 * Ejercicio 07: "Texto del enunciado del ejercicio/problema...."
 * @author NombreAutor
 * @version 1.0
 */

public class Ejercicio07_Rango_notas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
          System.out.print("Ingrese nota: ");
        int nota=tcl.nextInt();
        if(nota>=90 && nota<=100){
            System.out.println("Rango A");
        }else if (nota>=80 && nota<=89){
            System.out.println("Rango B");
        }else if (nota>=70 && nota<=79){
            System.out.println("Rango C");
        }else if (nota>=60 && nota<=69){
            System.out.println("Rango D");  
        }else if (nota >= 0 && nota < 60) {
            System.out.println("Rango F ");
        }else {
            System.out.println("FUERA DE RANGO");
        }
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */
