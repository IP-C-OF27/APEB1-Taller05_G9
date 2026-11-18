import java.util.Scanner;
/**
 * Problema 13: "Sistema de reservas hoteleras: En una hostería de la ciudad de
 * Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días, 
 * del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días.
 * Elaborar una solución que pida el número de días y el precio diario de la 
 * habitación y luego calcule e imprima el subtotal por pagar, el descuento y 
 * el total por pagar."
 * @author Alejandro, Ariel
 * @version 1.0
 */
public class Ejercicio13_Reservas_Hoteleras {
    public static void main(String[] args) {
        Scanner tcl=new Scanner(System.in);
        int dias;
        double prec_dia,subt,desc=0,tot;
        System.out.print("Ingrese el numero de dias de hospedaje: ");
        dias=tcl.nextInt();
        System.out.print("Ingrese el precio diario de la habitacion: ");
        prec_dia=tcl.nextDouble();
        subt=dias*prec_dia;
        if(dias>15){
            desc=subt*0.20;
        }else{
            if(dias>10){
                desc=subt*0.15;
            }else{
                if(dias>5){
                    desc=subt*0.10;
                }else{
                    desc=0.0;
                }
            }
        }
        tot=subt-desc;
        System.out.println("\n   DETALLE DE LA RESERVA    ");
        System.out.println("Dias de hospedaje: "+dias);
        System.out.println("Precio diario: $"+prec_dia);
        System.out.println("Subtotal por pagar: $"+subt);
        System.out.println("Descuento aplicado: $"+desc);
        System.out.println("Total por pagar: $"+tot);
    }
}