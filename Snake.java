import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake
{
    private int anchoLienzo;
    private int altoLienzo;
    private ArrayList<Segment> segmentos;
    private static final Color COLOR_SERPIENTE = java.awt.Color.BLACK;
    private static final int NUMERO_SEGMENTOS_INICIALES = 3;
    private static final int DIFERENCIA_DE_GRADOS_ENTRE_DIRECCIONES = 90;
    private static final int MARGEN_LIENZO = 10;

    /**
     * Constructor for objects of class Snake
     */
    public Snake(int altoLienzo, int anchoLienzo)
    {
        this.altoLienzo = altoLienzo;
        this.anchoLienzo = anchoLienzo;
        segmentos = new ArrayList<Segment>();
    }
}
