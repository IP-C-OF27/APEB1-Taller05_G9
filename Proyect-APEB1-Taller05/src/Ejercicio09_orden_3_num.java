
import java.util.Scanner;

/**
 * Problema 09: "Ordenamiento de Tres Números: Dados tres números, ordenarlos 
 * en orden ascendente."
 * 
 * @author Alejandro, Ariel
 * @version 1.0
 */
public class Ejercicio09_orden_3_num {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Ingrese el primer numero: ");
        n1 = tcl.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        n2 = tcl.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        n3 = tcl.nextInt();
        if (n1 <= n2) {
            if (n2 <= n3) {
                System.out.println("Orden ascendente: " + n1 + ", " + n2 + 
                        ", " + n3);
            } else {
                if (n1 <= n3) {
                    System.out.println("Orden ascendente: " + n1 + ", " + n3 + 
                            ", " + n2);
                } else {
                    System.out.println("Orden ascendente: " + n3 + ", " + n1 + 
                            ", " + n2);
                }
            }
        } else {
            if (n1 <= n3) {
                System.out.println("Orden ascendente: " + n2 + ", " + n1 + ", "
                        + n3);
            } else {
                if (n2 <= n3) {
                    System.out.println("Orden ascendente: " + n2 + ", " + n3 + 
                            ", " + n1);
                } else {
                    System.out.println("Orden ascendente: " + n3 + ", " + n2 + 
                            ", " + n1);
                }
            }
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el primer numero: 5
Ingrese el segundo numero: 7
Ingrese el tercer numero: 1
Orden ascendente: 1, 5, 7
BUILD SUCCESSFUL (total time: 17 seconds)
 */