import java.util.Random;
/**
 * Write a description of class Galleta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Galleta
{
    private int anchoLienzo;
    private int altoLienzo;
    private int posicionX;
    private int posicionY;
    private static final int DIAMETRO = 5;
    
    /**
     * Constructor for objects of class Galleta
     */
    public Galleta(int anchoLienzo, int altoLienzo)
    {
        this.anchoLienzo = anchoLienzo;
        this.altoLienzo = altoLienzo;
        Random num = new Random();
        posicionX = num.nextInt(anchoLienzo);
        posicionY = num.nextInt(altoLienzo);
    }
    
    /**
     * Dibuja la galleta
     */
    public void dibujar(Canvas lienzo)
    {
        lienzo.fillCircle(posicionX, posicionY, DIAMETRO);
    }
    
    /**
     * Borra la galleta
     */
    public void borrar(Canvas lienzo)
    {
        lienzo.eraseCircle(posicionX, posicionY, DIAMETRO);
    }
    
    /**
     * Devuelve la posicionX
     */
    public int getPosicionX()
    {
        return posicionX;
    }
    
    /**
     * Devuelve la posicionY
     */
    public int getPosicionY()
    {
        return posicionY;
    }
}
