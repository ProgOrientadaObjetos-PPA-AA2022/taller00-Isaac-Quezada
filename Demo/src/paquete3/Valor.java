package paquete3;
import paquete5.Dato;
public class Valor {
    
    public static int obtenerHabitantes(){
        return Dato.obtenerNumeroHombres() + Dato.obtenerNumeroMujeres();
    }
}
