import java.util.Scanner;
/**
 * Ejercicio 12: "Cálculo de impuestos: Desarrollar una solución que permita 
 * leer los datos de un automóvil (marca, origen y costo) imprima el impuesto 
 * por pagar y el precio de venta (incluido el impuesto) . Si el origen es
 * Alemania el impuesto es 20% , si es de Japón el impuesto es 30% , si es de 
 * Italia, 15% , y si es de USA, 8%"
 * @author Ariel, Alejandro
 * @version 1.0
 */
public class Ejercicio12_Calculo_De_Impuestos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Marca del Carro: ");
        String marc=tcl.nextLine();
        System.out.print("Origen del carro:  ");
        String ori=tcl.nextLine();
        System.out.print("Costo del carro: ");
        double cos=tcl.nextDouble(),imp=0;
        switch (ori) {
            case ("ALEMANIA"):
                imp=0.20;
                break;
            case ("JAPON"):
                imp=0.30;
                break;
            case ("ITALIA"):
                imp=0.15;
                break;
            case ("USA"):
                imp=0.08;
                break;
        default:System.out.println("Pais Invalido");
    }
    imp*=cos;
    double costt=cos+imp; 
    System.out.printf("Marca: %s\nOrigen: %s\nCosto: %s\nImpuesto: %.2f\n"
    +"Total: %.2f\n" ,marc,ori,cos,imp,costt);    
    }
    }
/***
run-single:
Marca del Carro: Toyota
Origen del carro:  Alemania
Costo del carro: 5000
Marca: Toyota
Origen: Alemania
Costo: 5000.0
Impuesto: 1000,00
Total: 6000,00
BUILD SUCCESSFUL (total time: 16 seconds)
 */