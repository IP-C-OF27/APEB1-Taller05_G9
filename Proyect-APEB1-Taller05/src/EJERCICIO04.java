/**
 * Ejercicio 04: "Descuento en Compras: Calcular el precio final de un producto 
 * con un descuento del 10% si el precio original es mayor de $100 ; De lo
 * contrario, no hay descuento."
 * @author Ariel Puertas, Alejandro Suing
 * @version 1.0
 */
import java.util.Scanner;
public class EJERCICIO04 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingresar el precio original: ");
        double preor=tcl.nextDouble(),prefi;
        if(preor>100){
            double desc=(preor*0.10);
            prefi=preor-desc;
            System.out.println("El precio final es: "+prefi);
        }else{
            System.out.println("El precio final es. "+preor);
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingresar el precio original: 1000
El precio final es: 900.0
BUILD SUCCESSFUL (total time: 2 minutes 9 seconds)
 */