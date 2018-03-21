/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author Pablo
 */
public abstract class Figuras2D extends FigurasGeometricas{
    private Posicion2D pos;
    
    abstract public double CalcularPerimetro ();

    /**
     * @return the pos
     */
    public Posicion2D getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(Posicion2D pos) {
            this.pos = pos;
    }
    
}
