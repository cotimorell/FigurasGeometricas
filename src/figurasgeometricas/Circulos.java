/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;


/**
 * Representa un círculo en el plano
 * @author Pablo
 */
public class Circulos extends Figuras2D {

    private double radio;
    
    public Circulos (Posicion2D posicion, double radio){ //constructor
        super (posicion, "Circulo");
        this.radio = radio; 
    }
    
    @Override
    protected void CalcularExtremos() throws FueraDelPlanoException {
        Posicion2D limSupCirc = new Posicion2D (getPos().getX(), getPos().getY()+ getRadio());
        Posicion2D limInfCirc = new Posicion2D (getPos().getX(), getPos().getY()- getRadio());
        Posicion2D limIzqCirc = new Posicion2D (getPos().getY(), getPos().getX()- getRadio());
        Posicion2D limDerCirc = new Posicion2D (getPos().getY(), getPos().getX()+ getRadio());
    }
    
    /**
     * 
     * @return la superficie
     */
    @Override
    public double CalcularSuperficie () {
        return Math.PI * Math.pow(radio,2);
       
    }
    
    /**
     * 
     * @return el perímetro
     */
    @Override
    public double CalcularPerimetro () {
        return 2 * Math.PI * radio;
    }
    
    /**
     * @param radio Establece el radio
     */
    public void setRadio(double radio) throws DimensionIncorrectaException{
        if (radio <= 0) {
            throw new DimensionIncorrectaException ();
        }
        this.radio = radio;
    }

    /**
     * @return el radio
     */
    public double getRadio() {
        return radio;
    }    
}
