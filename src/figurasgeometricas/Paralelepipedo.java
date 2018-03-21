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
public class Paralelepipedo extends Figuras3D {
    
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Paralelepipedo (double l1, double l2, double l3) { //constructor
        this.lado1 = l1;
        this.lado2 = l2;
        this.lado3 = l3;
    }
           
    
    @Override
    public double CalcularSuperficie () {
        return 2 * (getLado1() * getLado2() + getLado1() * getLado3() + getLado2() * getLado3());
    }
    
    @Override
    public double CalcularVolumen () {
        return getLado1() * getLado2() * getLado3();
    } 
    /**
     * @return the lado1
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * @param lado1 the lado1 to set
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * @return the lado2
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * @param lado2 the lado2 to set
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * @return the lado3
     */
    public double getLado3() {
        return lado3;
    }

    /**
     * @param lado3 the lado3 to set
     */
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }    
}
