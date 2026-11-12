
import java.util.Scanner;

/**
 * Ejercicio 01: "Mayor de tres números: Dados tres números distintos, 
 * determinar cuál es el mayor."
 * @author Alejandro, Ariel
 * @version 1.0
 */

public class Ejercicio03_mayor_tres_numeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
          System.out.print("Ingrese Nro1= ,Nro2= ,Nro3=");
        double Nro1=tcl.nextDouble(), Nro2=tcl.nextDouble(), Nro3=tcl.nextDouble();
        if (Nro1>Nro2&&Nro1>Nro3){
            System.out.printf("%.0f =Es el mayor\n",Nro1);
        }else if (Nro2>Nro1&&Nro2>Nro3){
            System.out.printf("%.0f =Es el mayor\n",Nro2);
        }else {
            System.out.printf("%.0f =Es el mayor\n",Nro3);
        }
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese Nro1= ,Nro2= ,Nro3= 3 2 1
3 =Es el mayor
BUILD SUCCESSFUL (total time: 9 seconds)
 */
