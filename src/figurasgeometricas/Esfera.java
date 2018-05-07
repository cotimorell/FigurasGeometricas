/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 * Representa una esfera en el plano
 * @author Pablo
 */
public class Esfera extends Figuras3D{

    private double radio;
    
    public Esfera (double radio) { //constructor
        this.radio = radio;
    }
    
    /**
     * 
     * @return la superficie de la esfera
     */
    @Override
    public double CalcularSuperficie () {
        return 4 * Math.PI * Math.pow(getRadio(),2);
    }
    
    /**
     * 
     * @return el volumen de la esfera
     */
    @Override
    public double CalcularVolumen () {
        return (4/3)* Math.PI * Math.pow(getRadio(),3);
    }
    
    
    /**
     * @return el radio de la esfera
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio Establece el radio de la esfera
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
