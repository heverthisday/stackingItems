package domain;

import shapes.Canvas;
import shapes.Rectangle;
import java.util.ArrayList;

/**
 * clase principal del simulador StackingItems.
 * gestiona una torre donde se apilan tazas y tapas.
 */
public class Tower {
    //constantes de visualizacion
    private static final int PIXELS_PER_CM = 10;
    private static final int BASE_WIDTH = 20;
    private static final int TOWER_MARGIN = 50;

    //atributos
    private int width;
    private int maxHeight;
    private ArrayList<Cup> cups;
    private ArrayList<Lid> lids;
    private  boolean isVisible;
    private  boolean ok;

    //formas visuales
    private Canvas canvas;
    private Rectangle towerFrame;
    private ArrayList<Rectangle> heightMarks ;

    /**
     * constructor de tower
     * @param width ancho de la torre
     * @param maxHeight altura maxima de la torre en cm
     */
    public Tower(int width, int maxHeight) {
        //implementar
    }
    //metodos de gestion de tazas (miniciclo dos)
    public void pushCup(int i){}
    public void popCup(){}
    public void removeCup(int i){}

    //metodos de gestion de tapas (mini ciclo 3)
    public void pushLid(int i){}
    public void popLid(){}
    public void removeLid(int i){}

    //metodos de reorganizacion (mini-ciclo 4)
    public void orderTower(){}
    public void reverseTower(){}

    //metodos de consuta (mini ciclo 4)

    public int height(){return 0;}
    public int [] lidedCups(){return null;}
    public String [][] stackingItems(){return null;}

    //metodos de visibilidad (minicilo 1)
    public void makeVisible(){}
    public void makeInvisible(){}
    public void exit (){}

    //metodo de estado

    public boolean ok() {
        return ok;
    }
}