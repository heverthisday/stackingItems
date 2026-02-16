package domain;

import shapes.Rectangle;


/**
 * Representa una taza cilindrica del simulador StracKIngsIems
 * Cada taza tiene una altura 2i-1c y base 1cm.
 */

public class Cup {
    //constantes
    private static final int BASE_THICKNESS = 1;
    //atributos
    private int number;
    private int height;
    private String color;
    private int xposition;
    private int yposition;
    // formas visuales
    private Rectangle body;
    private Rectangle base;

    /**
     * Constructor de cup
     * @param number Numero de taza (determina altura y diametro)
     * @param color color de la taza
     */

    public Cup(int number,String color) {
        // todo: implementar
    }
    //metodos publicos
    public void makeVisible(){}
    public void makeInvisible(){}
    public int getHeight() {return height;}
    public int getNumber(){return number;}
}