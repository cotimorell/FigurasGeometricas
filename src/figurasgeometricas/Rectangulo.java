/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pablo
 */
public class Rectangulo extends Figuras2D{
    
    private double largo;
    private double ancho;   
    
    public Rectangulo (double largo, double ancho) { //constructor
        this.largo = largo;
        this.ancho = ancho;
    }

    
    @Override
    public double CalcularSuperficie () {
        return largo*ancho;
    }
    
    @Override
    public double CalcularPerimetro () {
        return (largo + ancho) * 2;
    }
    /**
     * @param largo the largo to set
     * @throws figurasgeometricas.DimensionIncorrectaException
     */
    public void setLargo(double largo) throws DimensionIncorrectaException{
        if (largo <= 0){
            throw new DimensionIncorrectaException();
        }
        this.largo = largo;
    }

    /**
     * @param ancho the ancho to set
     * @throws figurasgeometricas.DimensionIncorrectaException
     */
    public void setAncho(double ancho) throws DimensionIncorrectaException {
        if (ancho <= 0){
            throw new DimensionIncorrectaException();
        }
        this.ancho = ancho;
    }

    /**
     * @return the largo
     */
    public double getLargo() {
        return largo;
    }

    /**
     * @return the ancho
     */
    public double getAncho() {
        return ancho;
    }
}
