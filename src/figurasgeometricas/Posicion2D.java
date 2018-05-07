/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 * Representa una posicion en el plano
 * @author Pablo
 */
public class Posicion2D {
    private static double limMinX = -1000;
    private static double limMinY = -1000;
    private static double limMaxX = 1000;
    private static double limMaxY = 1000;
    private double y;
    private double x;
    
    /**
     * Se crea la posición de la figura en el plano, se corrobora que esté dentro
     * de los límites
     * @param x
     * @param y
     * @throws FueraDelPlanoException 
     */
    public Posicion2D (double x, double y)throws FueraDelPlanoException{
        if (x<=limMaxX && x>=limMinX){            
            this.x = x;            
        }else{
            throw new FueraDelPlanoException();
        }
        if (y<=limMaxY && y>=limMinY){
            this.y = y;            
        }else{        
            throw new FueraDelPlanoException();
        }
    }
    

    
    
    
    /**
     * Retorna la distancia a un punto
     * @param pos
     * @return 
     */
    public double distancia (Posicion2D pos) {
        return Math.sqrt((Math.pow(pos.getX()-x,2))+(Math.pow(pos.getY()-y,2)));
    }

    /**
     * @return la posición en el eje y del plano
     */
    public double getY() {
        return y;
    }

    /**
     * @param y Establece la posición y del plano
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @return la posición en el eje x del plano
     */
    public double getX() {
        return x;
    }

    /**
     * @param x Establece la posición x del plano
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the limMinX
     */
    public static double getLimMinX() {
        return limMinX;
    }

    /**
     * @return the limMinY
     */
    public static double getLimMinY() {
        return limMinY;
    }

    /**
     * @return the limMaxX
     */
    public static double getLimMaxX() {
        return limMaxX;
    }

    /**
     * @return the limMaxY
     */
    public static double getLimMaxY() {
        return limMaxY;
    }
    
}
