package mision_tic_2022_programacion_orientada_a_objetos_ejercicio_clase;
public class Vendedor {
        double ventas;
        String documento;
        int tipo;
    public Vendedor (String documento, int tipo, double ventas){
        this.documento = documento;
        this.tipo=tipo;
        this.ventas = ventas;
    } 
    public double CalcularComision(){
     double comision;
     if (this.tipo==1){
         comision = this.ventas*0.25;
     }else if(this.tipo==2){
         comision = this.ventas*0.2;
     }else{
         comision = 0;
     }return comision;
    }
}
