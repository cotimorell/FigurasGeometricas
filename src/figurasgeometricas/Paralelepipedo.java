/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 * Representa un paralelepipedo en el plano
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
           
    /**
     * 
     * @return la superficie
     */
    @Override
    public double CalcularSuperficie () {
        return 2 * (getLado1() * getLado2() + getLado1() * getLado3() + getLado2() * getLado3());
    }
    
    /**
     * 
     * @return el volumen
     */
    @Override
    public double CalcularVolumen () {
        return getLado1() * getLado2() * getLado3();
    } 
    /**
     * @return el lado1
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * @param lado1 Establece el lado 1
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * @return el lado2
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * @param lado2 Establece el lado2
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * @return el lado3
     */
    public double getLado3() {
        return lado3;
    }

    /**
     * @param lado3 Establece el lado3
     */
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }    
}
