/**
 * Ejercicio 06: "Categoría de Edad: Clasificar a una persona en una categoría 
 * de edad (niño, adolescente, adulto) en función de su edad.
 * @author Ariel Puertas, Alejandro Suing
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio06_Categoria_De_Edad {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad=tcl.nextInt();
        if (edad<=11){
            System.out.println("Es un nino");
        }else if (edad>=12 && edad<=18){
            System.out.println("Es un adolescente");
        }else{
            System.out.println("Es un adulto");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingrese su edad: 12
Es un adolescente
BUILD SUCCESSFUL (total time: 2 seconds)
 */