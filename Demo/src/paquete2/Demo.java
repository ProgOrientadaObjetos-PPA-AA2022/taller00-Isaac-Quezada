package paquete2;
import paquete1.Mensaje;
import paquete5.Dato;
import paquete3.Valor;
public class Demo {
    
    public static void main(String[] args) {
        
        // System.out.printf(Mensaje.obtenerFrase()+ " con " + (Dato.obtenerNumeroHombres()+ Dato.obtenerNumeroMujeres()));
        System.out.printf("%s con %d %n", Mensaje.obtenerFrase(),Valor.obtenerHabitantes());
    }
    
}
