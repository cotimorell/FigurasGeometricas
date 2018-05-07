/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Representa un rectángulo en el plano
 * @author Pablo
 */
public class Rectangulo extends Figuras2D{
    
    private double largo;
    private double ancho;   
    
    public Rectangulo (double largo, double ancho, Posicion2D posicion) { //constructor
        super (posicion, "Rectangulo");
        this.largo = largo;
        this.ancho = ancho;
    }
    
    @Override
    public double CalcularSuperficie () {
        return largo*ancho;
    }
    
    /**
     * 
     * @return el perímetro del rectángulo
     */
    @Override
    public double CalcularPerimetro () {
        return (largo + ancho) * 2;
    }
    
    @Override
    protected void CalcularExtremos () throws FueraDelPlanoException{
        Posicion2D xIzq = new Posicion2D (getPos().getY(), getPos().getX()-(getLargo()/2));
        Posicion2D xDer = new Posicion2D (getPos().getY(), getPos().getX()+(getLargo()/2));
        Posicion2D ySup = new Posicion2D (getPos().getX(),getPos().getY()+(getAncho()/2));
        Posicion2D yInf = new Posicion2D (getPos().getX(),getPos().getY()-(getAncho()/2));
    }
    
    /**
     * @param largo Establece el largo del rectángulo
     * @throws figurasgeometricas.DimensionIncorrectaException
     */
    public void setLargo(double largo) throws DimensionIncorrectaException{
        if (largo <= 0){
            throw new DimensionIncorrectaException();
        }
        this.largo = largo;
    }

    /**
     * @param ancho Establece el ancho del rectángulo
     * @throws figurasgeometricas.DimensionIncorrectaException
     */
    public void setAncho(double ancho) throws DimensionIncorrectaException {
        if (ancho <= 0){
            throw new DimensionIncorrectaException();
        }
        this.ancho = ancho;
    }

    /**
     * @return el largo
     */
    public double getLargo() {
        return largo;
    }

    /**
     * @return el ancho
     */
    public double getAncho() {
        return ancho;
    }
}
