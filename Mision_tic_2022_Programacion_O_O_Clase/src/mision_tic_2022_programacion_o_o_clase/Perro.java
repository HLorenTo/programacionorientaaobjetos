package mision_tic_2022_programacion_o_o_clase;
public class Perro {
    private String nombre;
    private int edad;
    public void Cambiar(String nombre, int edad){ //sobrecarga 1 con 2 parametros un String y un entero
        this.nombre= nombre;
        this.edad=edad;
    }
    public void Cambiar(String nombre){// sobrecarga 2, un parametro String
        this.nombre=nombre;
      
    }
    public void Cambiar (int edad){//sobrecarga 3, un parametro entero
        this.edad=edad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
