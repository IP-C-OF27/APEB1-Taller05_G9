import java.util.Scanner;

/**
 * Problema 10: "Valores pares o impares: Dado un valor entero ingresado por 
 * teclado (positivo o negativo) , determine si se trata de un valor par o impar.
 * @author Ariel, Alejandro 
 * @version 1.0
 */
public class Ejercicio10_Valores_pares_impares {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese numero:  ");
        int numero=tcl.nextInt();
        if(numero%2 ==0){
            System.out.printf("%d es par\n",numero);
        }else{
            System.out.printf("%d es impar\n",numero);
        }
    }    
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese numero:  44
44 es par
BUILD SUCCESSFUL (total time: 4 seconds)
 */