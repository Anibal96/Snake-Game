import java.util.ArrayList;
/**
 * Clase SnakeGame
 * 
 * @author Miguel Bayon
 * @version 1.0
 */
public class SnakeGame
{
    private Canvas lienzo;
    private Snake serpiente;
    private static final int ANCHO_LIENZO = 500;
    private static final int ALTO_LIENZO = 500;
    private ArrayList<Galleta> galletas;

    /**
     * Constructor de la clase Snake
     */
    public SnakeGame()
    {
        lienzo = new Canvas("Snake game", ANCHO_LIENZO, ALTO_LIENZO);
        galletas = new ArrayList<Galleta>();
    }

    /**
     * Dibuja una serpiente en la pantalla
     */
    public void drawSnake()
    {
        serpiente = new Snake(ANCHO_LIENZO,ALTO_LIENZO);
        lienzo.erase();
        serpiente.dibujar(lienzo);
    }

    /**
     * Anima la serpiente de la pantalla
     */
    public void animateSnake(){
        boolean mover = true;
        while(mover){
            lienzo.wait(200);
            serpiente.borrar(lienzo);
            mover = serpiente.mover(lienzo);
            serpiente.dibujar(lienzo);
        }
        lienzo.drawString("GAME OVER", (ANCHO_LIENZO/2)-45, ALTO_LIENZO/2);
    }
    
    /**
     * Dibuja un numero de galletas y mueve la serpiente
     */
    public void startGame(int numGalletas)
    {
        for(int cont = 0; cont < numGalletas; cont++){
            Galleta galleta = new Galleta(ANCHO_LIENZO, ALTO_LIENZO);
            galletas.add(galleta);
        }
        drawSnake();
        animateSnake();
    }
}