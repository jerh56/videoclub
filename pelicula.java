
/**
 * Write a description of class pelicula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pelicula extends producto
{
    // instance variables - replace the example below with your own
    private String genero;
    private int anioProduccion;

    /**
     * Constructor for objects of class pelicula
     */
    public pelicula()
    {
        // initialise instance variables
        genero ="Sin género";
        anioProduccion = 9999;
        nomProducto = "Salvaje";
        
    }
    
    public pelicula(String nomPelicula)
    {
        // initialise instance variables
        genero ="Sin género";
        anioProduccion = 9999;
        nomProducto = nomPelicula;
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
       return 0; 
    }
}
