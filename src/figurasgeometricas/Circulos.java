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
public class Circulos extends Figuras2D {

    private double radio;
    
    public Circulos (double radio){ //constructor
        this.radio = radio; 
    }
    
    @Override
    public double CalcularSuperficie () {
        return Math.PI * Math.pow(radio,2);
       
    }
    
    @Override
    public double CalcularPerimetro () {
        return 2 * Math.PI * radio;
    }
    
    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) throws DimensionIncorrectaException{
        if (radio <= 0) {
            throw new DimensionIncorrectaException ();
        }
        this.radio = radio;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }    
}
