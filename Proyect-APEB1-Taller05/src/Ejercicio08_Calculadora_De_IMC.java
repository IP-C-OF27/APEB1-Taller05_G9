/**
 * Ejercicio 08: "Calculadora de IMC: Calcula el índice de masa corporal (IMC) 
 * de una persona y la clasifica en función de su valor (bajo peso, peso normal,
 * sobrepeso, etc.) .
 * @author Ariel Puertas, Alejandro Suing
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio08_Calculadora_De_IMC {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese su peso (kg): ");
        double kg=tcl.nextDouble();
        System.out.print("Ingrese su altura (m): ");
        double m=tcl.nextDouble();
        double IMC;
        IMC=kg/(Math.pow(m, 2));
        System.out.printf("Su peso es %.1f",IMC);
        if(IMC<18){
            System.out.println("\t BAJO PESO");
        }else if (IMC>=18 && IMC<25){
            System.out.println("\t PESO NORMAL");
        }else if (IMC>=25 && IMC<30){
            System.out.println("\t SOBREPESO");
        }else if (IMC>=30 && IMC<40){
            System.out.println("\t OBESIDAD");
        }else {
            System.out.println("\t OBESIDAD MORBIDA");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingrese su peso (kg): 58
Ingrese su altura (m): 1,60
Su peso es 22,7	 PESO NORMAL
BUILD SUCCESSFUL (total time: 7 seconds)
BUILD SUCCESSFUL (total time: 12 seconds)
 */
