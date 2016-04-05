import java.awt.Color;
/**
 * Write a description of class Segment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Segment
{
    private int posicionX;
    private int posicionY;
    private int direccion;
    private Color color;
    public static final int LONGITUD_SEGMENTO = 4;
    /**
     * Constructor de la clase Segment
     */
    public Segment(int posicionX, int posicionY, int direccion, Color color)
    {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.direccion = direccion;
        this.color = color;
    }

    /**
     * Dibuja el segmento en el lienzo
     */
    public void dibujar(Canvas lienzo)
    {
        lienzo.setForegroundColor(color);
        lienzo.drawLine(posicionX,posicionY,getPosicionFinalX(),getPosicionFinalY());
    }

    /**
     * Borra el segmento del lienzo
     */
    public void borrar(Canvas lienzo)
    {
        lienzo.setForegroundColor(lienzo.getBackgroundColor());
        lienzo.drawLine(posicionX,posicionY,getPosicionFinalX(),getPosicionFinalY());
    }

    /**
     * Metodo que devuelve la posicion inicial del segmento en el eje X
     */
    public int getPosicionInicialX()
    {
        return posicionX;
    }

    /**
     * Metodo que devuelve la posicion inicial del segmento en el eje Y
     */
    public int getPosicionInicialY()
    {
        return posicionY;
    }

    /**
     * Metodo que devuelve la posicion final del segmento en el eje X
     */
    public int getPosicionFinalX()
    {
        int posicionFinalX = posicionX;
        if(direccion == 0){
            posicionFinalX = posicionFinalX + LONGITUD_SEGMENTO;
        }
        else if(direccion == 180){
            posicionFinalX = posicionFinalX - LONGITUD_SEGMENTO;
        }
        return posicionFinalX;
    }

    /**
     * Metodo que devuelve la posicion final del segmento en el eje Y
     */
    public int getPosicionFinalY()
    {
        int posicionFinalY = posicionY;
        if(direccion == 90){
            posicionFinalY = posicionFinalY + LONGITUD_SEGMENTO;
        }
        else if(direccion == 270){
            posicionFinalY = posicionFinalY - LONGITUD_SEGMENTO;
        }
        return posicionFinalY;
    }

    /**
     * Devuelve la direccion que tiene el segmento
     */
    public int getDireccion()
    {
        return direccion;
    }

    /**
     * Metodo que devuelve true si el segmento colisiona con otro 
     * y false en caso contrario
     */
    public boolean colisionaCon(Segment segmento)
    {
        boolean colisiona = false;
        if(segmento.getPosicionInicialX() ==  getPosicionFinalX()){
            if(segmento.getPosicionInicialY() == getPosicionFinalY()){
                colisiona = true;
            }
        }
        return colisiona;
    }
}
