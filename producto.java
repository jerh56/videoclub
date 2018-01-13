/**
 * Abstract class producto - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class producto
{
    // instance variables - replace the example below with your own
    String nomProducto;
    int montoRenta;
    int diasDePrestamo;
    boolean estaPrestado;

    producto(){
        montoRenta = 0;
        estaPrestado = false;
        nomProducto = "Sin nombre";
    }
}
