package domain;

/**
 * Clase principal para probar el simulador StackingItems
 */
public class Main {
    public static void main(String[] args) {
        // Crear una torre de ancho 5 y altura máxima 20 cm
        Tower tower = new Tower(5, 20);

        // Hacerla visible
        tower.makeVisible();

        System.out.println("Torre creada y visible. Estado ok: " + tower.ok());
    }
}