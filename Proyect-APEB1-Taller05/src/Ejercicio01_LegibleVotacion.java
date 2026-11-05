import java.util.Scanner;
/**
 * Ejercicio 01: "Edad para Votar: Determinar si una persona es elegible para 
 * votar en función de su edad (mayor o igual a 16 años)."
 * @author Alejandro, Ariel
 * @version 1.0
 */

public class Ejercicio01_LegibleVotacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        System.out.print("Pon tu edad: ");
        edad = tcl.nextInt();
        if (edad >= 16)
            System.out.println("Legible para votas");
        else 
            System.out.println("No legible para votas");
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Pon tu edad: 15
No legible para votas
BUILD SUCCESSFUL (total time: 3 seconds)
 */