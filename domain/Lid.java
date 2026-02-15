package domain;
import shapes.Rectangle;

/**
 * representa una tapa del simulador StackingItems.
 * Cada tapa tiene una altura fija de 1 cm y corresponde a una taza especifica
 */
public class Lid  {
    //constantes
    private static final int LID_HEIGHT = 1;

    //atributos
    private int number;
    private String color;
    private int xPosition;
    private int yPosition;

    //formas visuales
    private Rectangle body;

    /**
     * constructor de lid
     * @param number numero de tapa (debe corresponder a una taza)
     * @color color de la tapa (igual que el la taza)
     */
    public Lid(int number,String color){

    }
    public void makeVisible(){}
    public void makeInvisible{}
    public int getNumber() {
        return number;}

    public  int getdHeight() {
        return LID_HEIGHT;
    }
}