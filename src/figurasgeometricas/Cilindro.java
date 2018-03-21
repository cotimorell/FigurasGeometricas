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
public class Cilindro extends Figuras3D{
    private double radio;
    private double largo;
    
    public Cilindro (double radio, double largo){ //constructor
        this.radio = radio;
        this.largo = largo;
    }
    
    @Override
    public double CalcularSuperficie () {
        return 2 * Math.PI * getRadio() * (getRadio() + getLargo());
    }
    
    @Override
    public double CalcularVolumen () {
        return getLargo() * Math.PI * Math.pow(getRadio(),2);
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

    /**
     * @return the largo
     */
    public double getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(double largo) {
        this.largo = largo;
    }    
}
