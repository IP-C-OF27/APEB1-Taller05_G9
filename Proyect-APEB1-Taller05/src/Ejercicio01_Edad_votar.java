
import java.util.Scanner;

/**
 * Ejercicio 01: "Edad para Votar: Determinar si una persona es elegible 
 * para votar en función de su edad (mayor o igual a 16 años)."
 * 
 * @author Alejandro, Ariel
 * @version 1.0
 */
public class Ejercicio01_Edad_votar {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        System.out.print("Ingrese la edad de la persona: ");
        edad = tcl.nextInt();
        if (edad >= 16) {
            System.out.println("La persona es elegible para votar.");
        } else {
            System.out.println("La persona NO es elegible para votar.");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese la edad de la persona: 16
La persona es elegible para votar.
BUILD SUCCESSFUL (total time: 3 seconds)
 */
