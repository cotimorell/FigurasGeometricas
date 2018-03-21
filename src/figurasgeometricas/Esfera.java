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
public class Esfera extends Figuras3D{

    private double radio;
    
    public Esfera (double radio) { //constructor
        this.radio = radio;
    }
    
    @Override
    public double CalcularSuperficie () {
        return 4 * Math.PI * Math.pow(getRadio(),2);
    }
    
    @Override
    public double CalcularVolumen () {
        return (4/3)* Math.PI * Math.pow(getRadio(),3);
    }
    
    
    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
