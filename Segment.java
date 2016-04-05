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
    private static final int LONGITUD_SEGMENTO = 4;
    private Canvas canvas;
    private static final int DIFERENCIA_DE_GRADOS_ENTRE_DIRECCIONES = 90;
    private static final int MARGEN_LIENZO = 10;
    /**
     * Constructor de la clase Segment
     */
    public void segment(int posicionX, int posicionY, Canvas canvas, int direcion)
    {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.canvas = canvas;
        this.direccion = direccion;
    }
}
