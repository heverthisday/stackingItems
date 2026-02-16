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
        this.width = width;
        this.maxHeight = maxHeight;
        this.cups = new ArrayList<>();
        this.lids = new ArrayList<>();
        this.isVisible = false;
        this.ok = true;
        this.heightMarks = new ArrayList<>();

        //inicializar canvas
        canvas = Canvas.getCanvas();

        createTowerFrame();

        createHeightMarks();

    }
    /**
     * Crea el marco visual de la torre
     */
    private void createTowerFrame() {
        int frameWidth = width * BASE_WIDTH;
        int frameHeight = maxHeight * PIXELS_PER_CM;

        towerFrame = new Rectangle();
        towerFrame.changeSize(frameHeight, frameWidth);
        towerFrame.moveHorizontal(TOWER_MARGIN);
        towerFrame.moveVertical(TOWER_MARGIN);
        towerFrame.changeColor("white");
    }

    /**
     * Crea las marcas de centímetros en la torre
     */
    private void createHeightMarks() {
        for (int i = 0; i <= maxHeight; i++) {
            Rectangle mark = new Rectangle();
            mark.changeSize(2, 5);
            mark.moveHorizontal(TOWER_MARGIN - 10);
            mark.moveVertical(TOWER_MARGIN + (maxHeight - i) * PIXELS_PER_CM);
            mark.changeColor("black");
            heightMarks.add(mark);
        }
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
    // MÉTODOS DE VISIBILIDAD (Mini-Ciclo 1)
    public void makeVisible() {
        if (!isVisible) {
            canvas.setVisible(true);
            towerFrame.makeVisible();

            // Mostrar marcas de altura
            for (Rectangle mark : heightMarks) {
                mark.makeVisible();
            }

            // Mostrar todas las tazas
            for (Cup cup : cups) {
                cup.makeVisible();
            }

            // Mostrar todas las tapas
            for (Lid lid : lids) {
                lid.makeVisible();
            }

            isVisible = true;
        }
    }

    public void makeInvisible() {
        if (isVisible) {
            towerFrame.makeInvisible();

            // Ocultar marcas de altura
            for (Rectangle mark : heightMarks) {
                mark.makeInvisible();
            }

            // Ocultar todas las tazas
            for (Cup cup : cups) {
                cup.makeInvisible();
            }

            // Ocultar todas las tapas
            for (Lid lid : lids) {
                lid.makeInvisible();
            }

            isVisible = false;
        }
    }

    public void exit() {
        System.exit(0);
    }


    public boolean ok() {
        return ok;
    }
}