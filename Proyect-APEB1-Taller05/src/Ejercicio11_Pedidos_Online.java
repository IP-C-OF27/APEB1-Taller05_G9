
import java.util.Scanner;

/**
 * Problema 11: "Pedidos online: Desarrollar una solución que imprima el costo 
 * de un pedido de un artículo del cual se tiene la descripción, la cantidad 
 * que se requiere y el precio unitario. Si la cantidad pedida excede de 50 
 * unidades, se hace un descuento de 15%."
 * 
 * @author Alejandro, Ariel
 * @version 1.0
 */
public class Ejercicio11_Pedidos_Online {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String descrip;
        int cant;
        double prec_uni,subt,desc=0.0,cost_t;
        System.out.print("Ingrese la descripcion del articulo: ");
        descrip=tcl.nextLine();
        System.out.print("Ingrese la cantidad requerida: ");
        cant=tcl.nextInt();
        System.out.print("Ingrese el precio unitario: ");
        prec_uni=tcl.nextDouble();
        subt=cant*prec_uni;
        if(cant>50){
            desc=subt*0.15;
        }
        cost_t=subt-desc;
        System.out.println("\n    DETALLE DEL PEDIDO    ");
        System.out.println("Articulo: "+descrip);
        System.out.println("Cantidad: "+cant);
        System.out.println("Precio unitario: $"+prec_uni);
        System.out.println("Subtotal: $"+subt);
        System.out.println("Descuento aplicado: $"+desc);
        System.out.println("Costo total del pedido: $"+cost_t);
        tcl.close();
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese la descripcion del articulo: teclado mecanico
Ingrese la cantidad requerida: 60
Ingrese el precio unitario: 20

    DETALLE DEL PEDIDO    
Articulo: teclado mecanico
Cantidad: 60
Precio unitario: $20.0
Subtotal: $1200.0
Descuento aplicado: $180.0
Costo total del pedido: $1020.0
BUILD SUCCESSFUL (total time: 15 seconds)
 */