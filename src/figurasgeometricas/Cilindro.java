/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 * Representa un cilindro en el plano
 * @author Pablo
 */
public class Cilindro extends Figuras3D{
    private double radio;
    private double largo;
    
    public Cilindro (double radio, double largo){ //constructor
        this.radio = radio;
        this.largo = largo;
    }
    
    /**
     * 
     * @return la superficie
     */
    @Override
    public double CalcularSuperficie () {
        return 2 * Math.PI * getRadio() * (getRadio() + getLargo());
    }
    
    /**
     * 
     * @return el volumen
     */
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
     * @param radio Establece el radio
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
     * @param largo Establece el largo
     */
    public void setLargo(double largo) {
        this.largo = largo;
    }    
}
