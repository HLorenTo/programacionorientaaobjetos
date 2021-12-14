package mision_tic_2022_programacion_orientada_a_objetos_ejercicio_clase;
import java.util.Scanner;
public class Mision_tic_2022_Programacion_Orientada_a_objetos_Ejercicio_Clase {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese el documento: ");
       String doc = sc.next();
       System.out.println("Ingrese el tipo de vededor: ");
       int tv = sc.nextInt();
       System.out.println("Ingrese el número de ventas: ");
       double vent = sc.nextDouble();
       Vendedor v1 = new Vendedor(doc,tv,vent);
       System.out.println("La comision es de  "+v1.CalcularComision());
    }
    
}
