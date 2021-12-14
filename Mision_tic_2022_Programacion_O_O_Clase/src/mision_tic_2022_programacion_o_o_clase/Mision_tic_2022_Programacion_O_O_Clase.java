package mision_tic_2022_programacion_o_o_clase;
import java.util.Scanner;
public class Mision_tic_2022_Programacion_O_O_Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Perro perro = new Perro();
        perro.setNombre("Mara");
        perro.setEdad(2);
        Perro perro2 = new Perro();
        perro2.setNombre("Chiquita");
        perro2.setEdad(1);
        Perro perro3 = new Perro();
        perro3.setNombre("Rolo");
        perro3.setEdad(0);
        System.out.println("El nombre del perro 1 es: "+perro.getNombre()+" y la edad es de: "+perro.getEdad());
        System.out.println("El nombre del perro 1 es: "+perro2.getNombre()+" y la edad es de: "+perro2.getEdad());
        System.out.println("El nombre del perro 1 es: "+perro3.getNombre()+" y la edad es de: "+perro3.getEdad());
        perro.Cambiar("Pepe");
        perro2.Cambiar(3);
        perro3.Cambiar("Kyler", 4);
        System.out.println("Cambios:  ");
        System.out.println("El nombre del perro 1 es: "+perro.getNombre()+" y la edad es de: "+perro.getEdad());
        System.out.println("El nombre del perro 1 es: "+perro2.getNombre()+" y la edad es de: "+perro2.getEdad());
        System.out.println("El nombre del perro 1 es: "+perro3.getNombre()+" y la edad es de: "+perro3.getEdad());
        
    }
    
}
